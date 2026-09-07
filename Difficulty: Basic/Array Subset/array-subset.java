
class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> mapA=new HashMap();
        HashMap<Integer,Integer> mapB=new HashMap();
        for(int i=0;i<a.length;i++){ 
            if(mapA.containsKey(a[i])){ 
                int freq=mapA.get(a[i]);
                mapA.put(a[i],freq+1);
            }
            else mapA.put(a[i],1); 
        }
        for(int i=0;i<b.length;i++){ 
            if(mapB.containsKey(b[i])){
                int freq=mapB.get(b[i]);
                mapB.put(b[i],freq+1);
            }
            else mapB.put(b[i],1); 
        }
        for(int ele: mapB.keySet()){
            int freqA=mapA.getOrDefault(ele,0);
            int freqB=mapB.get(ele);
            if(freqA < freqB) return false;
        }
        return true;
    }
}
