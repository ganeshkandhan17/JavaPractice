import java.util.Scanner;
public class FirstLetter {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String arr[]=str.split(" ");
        for(String word:arr){
            System.out.println(word.charAt(0));
        }
    }
}
