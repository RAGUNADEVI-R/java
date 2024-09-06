import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
//        while(n!=0){
//            int rem=n%2;
//            n/=2;
//            if (rem==1){
//                count+=1;
//            }
//        }
//        System.out.print(count);
        int sum=0;
        while(n!=0){
            int rem=n%2;
            n/=2;
            sum=sum*10+rem;
        }
        System.out.print(sum);
    }
}
