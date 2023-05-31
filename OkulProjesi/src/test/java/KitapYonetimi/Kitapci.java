package KitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* kullanıcının kitap ekleme silme ve listeleme gibi işlemleri gibi işlemleri
      yapmasına imkan tanıyan bir uygulama yazınız

    program kitaplara 1001'den başlayarak sıralı ve otomatik numara vermeli
    bunun yanına her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilghiler girilebilmelidir

    Programın başlangıcında kullanıcıya aşağıdaki gibi bir menü sunulmalıdır
    kullanıcı programı bitirene kadar işleme devam etmelildir

    -------------Kitap Programı------------
    1-Kitap Ekle
    2- Numara ile kitap sil
    3- Tüm kitapları listele
    4- Bitir

 */
public class Kitapci {
    static List<Kitap> KitapListe = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int kitapNo = 1000;

    public static void main(String[] args) {


        KitapMethod.menu(KitapListe);

    }

/* public static void menu(List<Kitap> liste) {


        System.out.println("Kitap Programi\n1: Kirap ekle\n2: Numara ile kitap sil\n3: "+
                "Tum kitaplari listele\n4: Bitir");

        System.out.println("isleminizi seciniz");

        int tercih= scanner.nextInt();
        switch (tercih){

            case 1:
                kitapEkle(liste);
                break;
            case 2:
                noIleSil(liste);
                break;
            case 3:
                listele(liste);
                break;
            case 4:
                bitir();
                break;
            default:
                System.out.println("yanlis giris yapildi tekrar deneyiniz.");
                break;








        }

    }

    private static void listele(List<Kitap> liste) {

        for (Kitap k: liste) {
            System.out.println(k.toString());
        }
        menu(liste);
    }

    private static void noIleSil(List<Kitap> liste) {

        System.out.println("silinecek kitap no giriniz : ");
        int silinecekNo= scanner.nextInt();
        for (Kitap k:liste) {
            if (k.getNo() == silinecekNo) {
                liste.remove(k);
                menu(liste);
            }
        }

        System.out.println(silinecekNo + "ait kitap bulunamadi");
        menu(liste);

    }

    private static void kitapEkle(List<Kitap> liste) {

        System.out.println("Kitap ismi giriniz : ");
        scanner.nextLine();
        String kitapAdi=scanner.next();

        System.out.println("Kitap yazar ismi giriniz : ");
        String yazarAdi= scanner.next();
        System.out.println("Kitap yayin yilini giriniz : ");
        int yayinYili= scanner.nextInt();
        System.out.println("fiyatini giriniz : ");
        double fiyat = scanner.nextDouble();
        Kitap kitap=new Kitap(++kitapNo, kitapAdi, yazarAdi, yayinYili, fiyat); //kitap obj create edildi
        liste.add(kitap);
        System.out.println(kitap.toString() + "eklendi");
        menu(liste);
    }

    private static void bitir() {
        System.out.println("yine bekleriz");
    }
}
