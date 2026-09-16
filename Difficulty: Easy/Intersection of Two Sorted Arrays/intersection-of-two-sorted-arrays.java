class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        HashSet<Integer> setA=new HashSet<>();
        HashSet<Integer> setB=new HashSet<>();
        for(int i=0;i<a.length;i++){ setA.add(a[i]);}
        for(int i=0;i<b.length;i++){
            if(setA.contains(b[i])) setB.add(b[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num : setB){
            list.add(num);
        }
        Collections.sort(list);
        return list;
    }
}