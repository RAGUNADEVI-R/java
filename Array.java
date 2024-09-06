import java.util.PriorityQueue;

public class Array {
    public static  int Sum(PriorityQueue<Integer> pq){
        int b=pq.poll();
        int c=pq.poll();
        int sum=b+c;
        pq.add(sum);
        return sum;
    }
    public static void main(String[] args) {
        int totalSum=0;
        int a[]={7,8,6,1,2,1};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        while (pq.size() >1) {
            totalSum += Sum(pq);
        }
        System.out.print(totalSum);
    }
}

//7,8,6,1,2,1 ==> 1+1 ==>   2+
//7,8,6,2,2   ==> 2+2 ==>   4+
//7,8,6,4     ==> 4+6 ==>  10+
//7,8,10      ==> 7+8 ==>  15+
//10,15       ==> 10+15 ==>25+
//                         56
