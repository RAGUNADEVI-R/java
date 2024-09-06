import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        int totalSum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=a[k-1];
                }
                if(totalSum<sum){
                    totalSum=sum;
                }
            }
        }
        System.out.print(totalSum);
    }
}
