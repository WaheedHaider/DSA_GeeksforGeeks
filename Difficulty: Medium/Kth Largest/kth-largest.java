class Solution {
    public static int kthLargest(int a[], int k) {
    PriorityQueue<Integer> p=new PriorityQueue<>();
    for(int num : a){
        p.add(num);
    }
    int size=p.size();
    for(int i=0;i<(size-k);i++){
        p.poll();
    }
    return p.peek();
    }
}