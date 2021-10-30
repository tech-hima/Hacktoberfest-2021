// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/submissions/

class Solution {
    public double average(int[] sal) {
        int min = sal[0];
        int max = sal[0];
        
        for (int i = 0; i < sal.length; i++){
            if(sal[i] < min){
                min = sal[i];
            }
            else if(sal[i] > max){
                max = sal[i];
            }
        }
        double sum = 0;
        for(int i = 0; i < sal.length; i++){
            sum += sal[i];
        }
        
        double ans = (sum - (min + max))/(sal.length - 2);
        return ans;
 }
}
© 2021 GitHub, Inc.
