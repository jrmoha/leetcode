class MyHashSet {

     private final boolean exists[];

    public MyHashSet() {
        this.exists = new boolean[1000001];
    }

    public void add(int key) {
        this.exists[key] = true;
    }

    public void remove(int key) {
        this.exists[key] = false;
    }

    public boolean contains(int key) {
        return this.exists[key];
    }
}
