class BrowserHistory {
    int max = 0;
    int current = 0;
    HashMap<Integer, String> urlMap = new HashMap<>();

    public BrowserHistory(String homepage) {
        urlMap.put(current, homepage);
    }
    
    public void visit(String url) {
        current++;
        urlMap.put(current, url);
        max = current;
    }
    
    public String back(int steps) {
        current = Math.max(0, current-steps);
        return urlMap.get(current);
    }
    
    public String forward(int steps) {
        current = Math.min(max, current+steps);
        return urlMap.get(current);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */