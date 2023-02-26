import java.util.Scanner;

public class Score_Average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* @author Mehmet İRVASA,
           @date Feb 02 23 */;
        System.out.println ("Matematik için not giriniz:");
        int  Matematik = input.nextInt();

        System.out.println ("Fizik için not giriniz:");
        int Fizik = input.nextInt();

        System.out.println ("Kimya için not giriniz:");
        int Kimya = input.nextInt();

        System.out.println ("Türkçe için not giriniz:");
        int Turkce = input.nextInt();

        System.out.println ("Tarih için not giriniz:");
        int Tarih = input.nextInt();

        int ToplamNot = Matematik + Fizik + Kimya + Turkce + Tarih;
        float Ortalama =  ToplamNot / 5f;
        String Sonuc = Ortalama > 60 ? "Geçti" : "Kaldı";
        System.out.println(Sonuc);
        input.close();
    }
}
    /*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

    Ödev
    Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

    Not : If ve Else kullanılmayacak...*/