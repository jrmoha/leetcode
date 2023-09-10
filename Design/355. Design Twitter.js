var Twitter = function () {
    this.tweets = {};
    this.follwers = {};
    this.time = 0;
};

/** 
 * @param {number} userId 
 * @param {number} tweetId
 * @return {void}
 */
Twitter.prototype.postTweet = function (userId, tweetId) {
    this.time++;
    if (!this.tweets.hasOwnProperty(userId)) {
        this.tweets[userId] = [{ tweetId, time: this.time }];
    } else {
        this.tweets[userId].push({ tweetId, time: this.time });
    }
};

/** 
 * @param {number} userId
 * @return {number[]}
List<Integer> getNewsFeed(int userId) Retrieves the 10 most recent tweet IDs in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user themself
. Tweets must be ordered from most recent to least recent.
*/

Twitter.prototype.getNewsFeed = function (userId) {
    let res = [];
    if (this.tweets.hasOwnProperty(userId)) {
        res = res.concat(this.tweets[userId]);
    }
    if (this.follwers.hasOwnProperty(userId)) {
        this.follwers[userId].forEach(follower => {
            if (this.tweets.hasOwnProperty(follower)) {
                res = res.concat(this.tweets[follower]);
            }
        });
    }
    res.sort((a, b) => b.time - a.time);
    return res.slice(0, 10).map(tweet => tweet.tweetId);
};

/** 
 * @param {number} followerId 
 * @param {number} followeeId
 * @return {void}
 */
Twitter.prototype.follow = function (followerId, followeeId) {
    if (!this.follwers.hasOwnProperty(followerId)) {
        this.follwers[followerId] = [followeeId];
    } else if(!this.follwers[followerId].includes(followeeId)){
        this.follwers[followerId].push(followeeId);
    }
};

/** 
 * @param {number} followerId 
 * @param {number} followeeId
 * @return {void}
 */
Twitter.prototype.unfollow = function (followerId, followeeId) {
    if (this.follwers.hasOwnProperty(followerId)) {
        this.follwers[followerId] = this.follwers[followerId].filter(id => {
            return id !== followeeId;
        });
    }
};