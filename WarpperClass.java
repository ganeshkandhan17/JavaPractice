public class WarpperClass{
    public static void main(String[] args) {
        System.out.println();

        byte b1=20;
        Byte b=new Byte(b1);
        Byte b2=Byte.valueOf(b1);
        short s1=20;
        Short s =new Short(s1);
        Short s2=Short.valueOf(s1);
        int i1=30;
        Integer a=new Integer(i1);
        Integer a1=Integer.valueOf(i1);
        long l1=200;
        Long l=new Long(l1);
        Long l2=Long.valueOf(l1);

        Double d=new Double(5.10);
        Double d1=Double.valueOf(10.234d);
        Float f=new Float(12.02);
        Float f1=Float.valueOf(10.2334f);

        String str=new String("Hi");
        String str1=String.valueOf("Ganesh");
        Character ch=new Character('C');
        Character ch1=Character.valueOf('c');

        Boolean bo=new Boolean(true);
        Boolean bo1=Boolean.valueOf(true);

        System.out.println(b);
        System.out.println(s);
        System.out.println(a);
        System.out.println(l);
        System.out.println(d);
        System.out.println(l);
        System.out.println(f);
        System.out.println(str);
        System.out.println(ch);
        System.out.println(bo);

        System.out.println("------------");
        System.out.println(b2); 
        System.out.println(s1);
        System.out.println(a1);
        System.out.println(l2);
        System.out.println(d1);
        System.out.println(f1);
    }
}