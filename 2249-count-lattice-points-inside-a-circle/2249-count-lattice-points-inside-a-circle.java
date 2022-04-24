class Solution {
    public int countLatticePoints(int[][] circles) {
        int count = 0;
        for (int xCoordinate = 0; xCoordinate <= 200; xCoordinate++) {
            for (int yCoordinate = 0; yCoordinate <= 200; yCoordinate++) {
                for (int i = 0; i < circles.length; i++) {
                    int[] circle = circles[i];
                    int xCircle = circle[0];
                    int yCircle = circle[1];
                    int radiusCircle = circle[2];
                    
                    if (Math.pow(xCoordinate - xCircle, 2) + Math.pow(yCoordinate - yCircle, 2) <= Math.pow(radiusCircle, 2)) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}