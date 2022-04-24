class UndergroundSystem {

    Map<String, Integer> totalTravels = new HashMap<>();
    Map<String, Long> totalTimeStay = new HashMap<>();
    Map<Integer, String> stationName = new HashMap<>();
    Map<Integer, Integer> time = new HashMap<>();

    public UndergroundSystem() {}

    public void checkIn(int id, String stationName, int t) {
        this.stationName.put(id, stationName);// where is custID
        time.put(id, t);// put check in time
    }

    public void checkOut(int id, String stationName, int t) {
        String code = this.stationName.get(id) + "*" + stationName;// custID start-end
        int cha = t - time.get(id);
        this.stationName.remove(id);
        time.remove(id);
        if (!totalTravels.containsKey(code)) //travelled 1st time
            totalTravels.put(code, 0);
        totalTravels.put(code, totalTravels.get(code) + 1);// update total 
        if (!totalTimeStay.containsKey(code)) 
            totalTimeStay.put(code, 0L);
        totalTimeStay.put(code, totalTimeStay.get(code) + cha);
    }

    public double getAverageTime(String startStation, String endStation) {
        String code = startStation + "*" + endStation;
        double x = totalTimeStay.get(code);
        return x / totalTravels.get(code);
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */