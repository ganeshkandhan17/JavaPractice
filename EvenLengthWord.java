import java.util.Scanner;
public class EvenLengthWord {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String arr[]=str.split(" ");
        for(String word:arr){
            int len=word.length();
            if(len%2==0){
                System.out.println(word);
            }
        }
    }
}
