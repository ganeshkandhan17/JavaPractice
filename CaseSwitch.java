import java.util.Scanner;
class CaseSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=ch;
            if(ascii>=65&&ascii<=87){
                System.out.print((char)(ascii+32));
            }
            else if(ascii>=97&&ascii<=124){
                System.out.print((char)(ascii-32));
            }
            else{
                System.out.print(ch);
            }
            
        }
    }
}
