import java.util.Scanner;

public class Problem1 {

    static  void printNto1(int n){

        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNto1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNto1(n);
    }
}
