package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[9];
        for (int i = 0; i <9 ; i++) {
            arr[i]=sc.nextLine();
        }
        System.out.println("---------");
        for (int i = 0; i <9 ; i=i+3) {
            System.out.print("| ");
            for (int j = i; j <i+3 ; j++) {
                System.out.print(arr[j]+" ");

            }
            System.out.println("|");

        }
        System.out.println("---------");

    }
}
