class Solution {
    public int maxOnes(int a[], int k) {
    int i=0,zero=0,maxLen=0;
    for(int j=0;j<a.length;j++){
        if(a[j]==0) zero++;
        while(zero>k){
            if(a[i]==0) zero--;
            i++;
        }
        maxLen=Math.max(maxLen,j-i+1);
    }
    return maxLen;
    }
}