class MyHashSet {
    private boolean[] st;
    public MyHashSet() {
        st=new boolean[1000001]; 
    }
    public void add(int key) {
        st[key] = true;        
    }
    public void remove(int key) {
        st[key] = false;   
    }
    public boolean contains(int key) {
        return st[key]; 
    }
}
