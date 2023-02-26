package Package1;

public class HelloWorld {
    public static void main (String[] args){
        int numberone, numbertwo=2, numberthree;
        int a = numbertwo;
        /*Burası birden fazla yorum satırıdır
         System.out.println(a+a);
         */
        /** Javadoc
         @aythor Mehmet İRVASA
         @code {@code kullanım örneği}*/
        Float Vfloat = 4.014f;
        char vchar = 74;
        char v1char = 65;
        char v2char = 86;
        char v3char = 'A';
        boolean vtrue= true;
        boolean vfalse = false;
        String vstr = "Javayı seviyorum";
        //String Kelime = vchar+v1char+v2char+v3char;
        int d = 4, b = 7, c = 8;
        boolean condition = d < b;
        boolean condition2 = b <= c;
        boolean result = condition && condition2;
        String kosuloperator = result ? "kralsın kardeşim, yine doğru" : "çuvaldın be arkadaş" ;
        byte f = 0;
        int e = f++;
        int g =-12, h = -5;
        int mod = g%h;
        System.out.println(mod);
        System.out.println(e);
        System.out.println(result);
        System.out.println(kosuloperator);
        System.out.println(a*a);
        System.out.println("Hello_World\tFreedom");
        System.out.println(Vfloat);
        System.out.println(""+ vchar+v1char+v2char+v3char);
        System.out.println(vtrue);
        System.out.println(vstr);
    }
}


