import java.util.Scanner;
public class M3Q09{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data[]={8,4,3,5,1,9};
        for(int i = 0 ; i < data.length ; i++){
            for(int j =i+1;j<data.length;j++){
                if(data[i]>data[j]){
                    int tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        
            System.out.print(data[i]);
        }
    }
}
