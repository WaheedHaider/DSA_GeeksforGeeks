class Solution {
    int maxSubarraySum(int[] a) {
    int j=1,currsum=a[0],maxsum=a[0];
    while(j<a.length){
        currsum=Math.max(currsum+a[j],a[j]);
        maxsum=Math.max(maxsum,currsum);
        j++;
    }
    return maxsum;
    }
}
