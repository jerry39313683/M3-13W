import java.util.Scanner;
public class M3Q4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        int c = scn.nextInt();
        int data[] = new int[i];
        for(int d = 1 ; d <= c ; d++ ){
            for(int a = 0 ; a < i ; a++ ){
                for(int b = 0 ; b <= a ; b++ ){
                    data[a] = (b+1)*d ;
                }
            System.out.print(data[a] + "\t");
        }
        System.out.println();
        }
    }
}
