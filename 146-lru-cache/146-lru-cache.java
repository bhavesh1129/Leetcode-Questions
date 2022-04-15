class LRUCache {
    LinkedHashMap<Integer, Integer> cache;
    int size;
    
    public LRUCache(int capacity) {
        this.cache = new LinkedHashMap<>();
        this.size = capacity;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            int value = cache.remove(key);
            cache.put(key, value);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.remove(key);
        }
        cache.put(key, value);
        if (cache.size() > size) {
            for (int k : cache.keySet()) {
                cache.remove(k);
                return;
            }
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */