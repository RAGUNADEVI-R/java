import java.util.ArrayList;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<>();
        while(sc.hasNext()){
            ar.add(sc.nextInt());
        }
        sc.close();
        for (int i:ar) {
            System.out.print(i);
        }
    }
}
