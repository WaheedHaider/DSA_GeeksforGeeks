class Solution {
    ArrayList<Integer> countDistinct(int a[], int k) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        while(j<a.length){
            map.put(a[j],map.getOrDefault(a[j],0)+1);
            if(j-i==k-1){ 
                list.add(map.size()); 
                if(map.get(a[i])==1) map.remove(a[i]);
                else map.put(a[i],map.get(a[i])-1);
                i++;
            }
            j++;
        }
        return list;
    }
}