import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++){
            if(i+j<4){
                System.out.print(" ");
            }
    }
        for(int k=i;k>0;k--) {
            System.out.print(k + 1);
        }
        for(int l=0;l<=i;l++){
            System.out.print(l+1);
        }
        System.out.println();
    }
    }
}


//ip-5
//        op-
//            1
//           212
//          32123
//         4321234
//        543212345