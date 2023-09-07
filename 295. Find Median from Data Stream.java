 class MedianFinder {

    private final ArrayList<Integer> stream;

    public MedianFinder() {
        stream = new ArrayList<>();
    }

    public void addNum(int num) {
        if (this.stream.isEmpty()) {
            this.stream.add(0, num);
        } else {
            int i = this.binarySearch(this.stream, num);
            this.stream.add(i, num);
        }
    }

    public double findMedian() {
        int size = this.stream.size();
        if (size == 0) {
            return 0;
        }
        if (size % 2 == 0) {
            return (double) (this.stream.get((size / 2) - 1) + this.stream.get(size / 2)) / 2;
        }
        return this.stream.get(size / 2);
    }
    private int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = list.get(mid);

            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
