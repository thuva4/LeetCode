package Java;

/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines
are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis
forms a container, such that the container contains the most water.
 */

//Problem: https://leetcode.com/problems/container-with-most-water/

public class ContainerWithMostWater {

    public int maxAreaImproved(int[] height) {
        int maxVolume = 0;
        int i = 0;
        int j = height.length-1;

        while (i!=j){
            maxVolume= Math.max(Math.min(height[i], height[j])* (j-i), maxVolume);
            if(height[i]>height[j]){
                j--;
            } else{
                i++;
            }
        }
        return maxVolume;
    }

    public int maxArea(int[] height) {
        int maxVolume = 0;
        for(int i=0; i<height.length-1;i++){
            for(int j=i+1; j<height.length;j++){

                int volume = Math.min(height[i], height[j])*(j-i);
                // System.out.println(i + " " + j + " " + volume );
                if(maxVolume<volume){

                    maxVolume = volume;
                }
            }
        }
        return maxVolume;
    }
}
