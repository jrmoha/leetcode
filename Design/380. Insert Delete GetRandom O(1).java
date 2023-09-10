class RandomizedSet {

    private final ArrayList<Integer> arr;
    private final Map<Integer, Integer> map;
    private int index;

    public RandomizedSet() {
        arr = new ArrayList<>();
        map = new HashMap<>();
        index = 0;
    }

    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            this.map.put(val, this.index);
            this.index++;
            this.arr.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (this.map.containsKey(val)) {
            int removeIndex = this.map.get(val);
            int lastIndex = this.index - 1;
            int lastValue = this.arr.get(lastIndex);

            this.arr.set(removeIndex, lastValue);
            this.map.put(lastValue, removeIndex);

            this.arr.remove(lastIndex);
            this.map.remove(val);
            this.index--;

            return true;
        }
        return false;
    }

    public int getRandom() {
        return this.arr.get((int) Math.floor(Math.random() * arr.size()));
    }
}