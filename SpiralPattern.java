import java.util.Scanner;
public class SpiralPattern{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=n+1;
        n=n*2;
        for (int row = 1; row < n ; row++){
            for (int col = 1; col < n ; col++){
                int f = x - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(f + " ");
            }
            System.out.println();
        }
    }
}
