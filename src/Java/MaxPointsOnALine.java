package Java;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;

/*
Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
Problem: https://leetcode.com/problems/max-points-on-a-line/
 */
public class MaxPointsOnALine {
    public int maxPoints(int[][] points) {
        int size = points.length;
        HashMap<String, String[]> equationConstants = new HashMap<>();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return 1;
        }
        if (size == 2) {
            return 2;
        }
        int max = 1;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (i != j) {
                    int x1 = points[i][0];
                    int y1 = points[i][1];
                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    String equation;
                    if ((x2 - x1) == 0) {
                        equation = "x=" + x2;
                    } else if ((y1 - y2) == 0) {
                        String c = String.valueOf(BigDecimal.valueOf((long) ((y1 * x2) - (y2 * x1))).divide(BigDecimal.valueOf((long) (x2 - x1)), MathContext.DECIMAL64));
                        if (c.equals(String.valueOf(-0.0))) {
                            c = String.valueOf(0.0);
                        }
                        equation = "y=" + c;
                    } else {
                        String m;
                        String c;
                        m = String.valueOf(BigDecimal.valueOf((long) (y2 - y1)).divide(BigDecimal.valueOf((long) (x2 - x1)), MathContext.DECIMAL64));
                        c = String.valueOf(BigDecimal.valueOf((long) ((y1 * x2) - (y2 * x1))).divide(BigDecimal.valueOf((long) (x2 - x1)), MathContext.DECIMAL64));
                        if (m.equals(String.valueOf(-0.0))) {
                            m = String.valueOf(0.0);
                        }
                        if (c.equals(String.valueOf(-0.0))) {
                            c = String.valueOf(0.0);
                        }
                        equation = "y=" + m + "x" + "+" + c;
                    }
                    String key = equation;
                    if (equationConstants.containsKey(key)) {
                        String point = equationConstants.get(key)[0];
                        if (!point.contains('p' + String.valueOf(i) + ",")) {
                            String[] data = new String[2];
                            data[0] = point + 'p' + String.valueOf(i) + ",";
                            data[1] = String.valueOf(Integer.parseInt(equationConstants.get(key)[1]) + 1);
                            equationConstants.put(key, data);
                            if (max < Integer.parseInt(data[1])) {
                                max = Integer.parseInt(data[1]);
                            }
                        }
                        if (!point.contains('p' + String.valueOf(j) + ",")) {
                            String[] data = new String[2];
                            data[0] = point + 'p' + String.valueOf(j) + ",";
                            data[1] = String.valueOf(Integer.parseInt(equationConstants.get(key)[1]) + 1);
                            equationConstants.put(key, data);
                            if (max < Integer.parseInt(data[1])) {
                                max = Integer.parseInt(data[1]);
                            }
                        }
                    } else {
                        String[] data = new String[2];
                        data[0] = "p" + i + "," + "p" + j + ",";
                        data[1] = String.valueOf(2);
                        equationConstants.put(key, data);
                        if (max < Integer.parseInt(data[1])) {
                            max = Integer.parseInt(data[1]);
                        }
                    }
                }
            }
        }
        return max;
    }
    public static void main(String [] args){
        MaxPointsOnALine maxPointsOnALine = new MaxPointsOnALine();
        //[[0,-12],[5,2],[2,5],[0,-5],[1,5],[2,-2],[5,-4],[3,4],[-2,4],[-1,4],[0,-5],[0,-8],[-2,-1],[0,-11],[0,-9]]
        int [][] points = {{0,0},{94911151,94911150},{94911152,94911151}};
        System.out.println(maxPointsOnALine.maxPoints(points));
    }
}