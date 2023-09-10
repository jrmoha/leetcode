class MyHashMap {

    private final int keys[];

    public MyHashMap() {
        this.keys = new int[1000001];
       for(int i=0;i<this.keys.length;i++){this.keys[i]=-1;}
    }

    public void put(int key, int value) {
        this.keys[key] = value;
    }

    public int get(int key) {
        if (this.keys[key]!=-1) {
            return this.keys[key];
        }
        return -1;
    }

    public void remove(int key) {
        this.keys[key] = -1;
    }
}
