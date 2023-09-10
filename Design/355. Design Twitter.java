class Tweet {

    private final int tweetId;
    private final int userId;
    private final int time;

    public Tweet(int tweetId, int userId, int time) {
        this.tweetId = tweetId;
        this.userId = userId;
        this.time = time;
    }

    public int getTime() {
        return this.time;
    }

    public int getTweetID() {
        return this.tweetId;
    }

    public int getUserID() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "Time = " + this.time + ", ID = " + this.tweetId + ", user = " + this.userId;
    }
}

class Twitter {

    Map<Integer, LinkedList<Tweet>> tweets;
    Map<Integer, LinkedList<Integer>> followers;
    private int time;

    public Twitter() {
        this.tweets = new HashMap<>();
        this.followers = new HashMap<>();
        this.time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        this.time++;
        Tweet tweet = new Tweet(tweetId, userId, this.time);
        if (!tweets.containsKey(userId)) {
            this.tweets.put(userId, new LinkedList<>(Arrays.asList(tweet)));
        } else {
            this.tweets.get(userId).add(tweet);
        }
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> tweets_pq = new PriorityQueue<>((t1, t2) -> {
            return t2.getTime() - t1.getTime();
        });
        if (this.tweets.containsKey(userId)) {
            for (Tweet tweet : this.tweets.get(userId)) {
                tweets_pq.add(tweet);
            }
        }
        if (this.followers.containsKey(userId)) {
            for (int followeeId : this.followers.get(userId)) {
                if (this.tweets.containsKey(followeeId)) {
                    for (Tweet tweet : this.tweets.get(followeeId)) {
                        tweets_pq.add(tweet);
                    }
                }
            }
        }
        List<Integer> result = new LinkedList<>();
        while (result.size() < 10 && !tweets_pq.isEmpty()) {
            result.add(tweets_pq.poll().getTweetID());
        }
        return result;
    }

    public void follow(int followerId, int followeeId) {
        if (!followers.containsKey(followerId)) {
            this.followers.put(followerId, new LinkedList<>(Arrays.asList(followeeId)));
        } else if (this.followers.get(followerId).indexOf(followeeId) < 0) {
            this.followers.get(followerId).add(followeeId);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        if (followers.containsKey(followerId)) {
            this.followers.get(followerId).remove(this.followers.get(followerId).indexOf(followeeId));
        }
    }
}
