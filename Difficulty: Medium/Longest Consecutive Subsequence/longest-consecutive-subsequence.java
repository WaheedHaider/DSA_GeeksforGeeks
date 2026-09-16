class Solution {
    public int longestConsecutive(int[] a) {
        int count=0,maxcount=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                count=1;
                while(set.contains(num+count)){
                    count++;
                }
                maxcount=Math.max(count,maxcount);
            }
        }
        return maxcount;
    }
}