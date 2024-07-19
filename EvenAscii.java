import java.util.Scanner;
public class EvenAscii {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        for(int i=0;i<str.length();i++){
            int ascii=str.charAt(i);
            if(ascii%2==0){
                System.out.print((char)ascii);
            }
        }
    }
}
