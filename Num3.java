import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                for(int k=0;k<i;k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

//ip:        5
//op:        5555544444333332222211111
//           55554444333322221111
//           555444333222111
//           5544332211
//           54321
