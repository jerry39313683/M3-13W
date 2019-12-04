import java.util.Scanner;
import java.util.Random;
public class M3Q02{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(23323456);
        boolean flag = true;
        int i=0;
        int data[]=new int[6];
        while(i<6){
            flag = true;
        data[i]=rand.nextInt(42)+1;
        for(int j=0;j<i;j++){
        if(data[i]==data[j]){
            flag = false;
            break;
        }
        }
        if(flag){
            i++;
        }
        }
        for(int  k = 0 ; k<6 ;k++){
            System.out.print(data[k]+" ");
        }
        System.out.println();
    }
}
