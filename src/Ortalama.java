import java.util.Scanner;
public class Ortalama {
    public static void main (String[] args){
    // degıiskenleri olustur
        int mat,fizik,kimya, turkce,tarih,muzik;
        // sacnner sınıfımızı tanımlıyoruz
        Scanner inp=new Scanner(System.in);
        // kullanıcıfdan değerleri al;
        System.out.print("Matematik notunuzu giriniz: ");
        mat= inp.nextInt();
        System.out.println(mat);
        System.out.print("fizik notunuzu giriniz: ");
        fizik= inp.nextInt();
        System.out.print("turkce notunuzu giriniz: ");
        turkce= inp.nextInt();
        System.out.print("kimya notunuzu giriniz: ");
        kimya= inp.nextInt();
        System.out.print("tarih notunuzu giriniz: ");
        tarih= inp.nextInt();
        System.out.print("muzik notunuzu giriniz: ");
        muzik= inp.nextInt();

     double toplam =(mat+fizik+kimya+turkce+tarih+muzik);
    double ort=toplam/6;
        System.out.println("ortalamanız: "+ort);
        String durum= ort>=60 ? "sınıfı geçti" : "sınıfta kaldı!";
        System.out.println(durum);


    }

}
