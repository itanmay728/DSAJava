import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i * i <= n; i++){
            System.out.print(i*i + " ");
        }
    }
}
