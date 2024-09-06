import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//10672
        int i=0,l=0,temp=n;
        int arr[]=new int[5];
        while(n!=0){
            arr[i]=n%10;
            n/=10;
            i++;
        }
        for(int j=arr.length-1;j>=0;j--){
           switch (arr[j]){
               case 2:
                   arr[j]=5;
                   break;
               case 5:
                   arr[j]=2;
                   break;
               case 6:
                   arr[j]=9;
                   break;
               case 9:
                   arr[j]=6;
                   break;
           }
            l=l*10+arr[j];
        }
        int sum=temp+l;
        System.out.print(sum);
    }
}
//ip:  10672
//op:  21647
