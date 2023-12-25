import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class KullaniciGirisi {

    private final String dogruKullaniciAdi = "java";
    private final String dogruSifre = "java.2023";
    private final int maxDeneme = 2;
    int denemeSayisi;
    boolean flag = true;
    Scanner scan = new Scanner(System.in);

    public void girisYap()
    {
        while(flag)
        {
            System.out.println("Kullanıcı adını giriniz: ");
            String kullaniciAdi = scan.next();
            System.out.println("Şifreyi giriniz: ");
            String sifre = scan.next();

            denemeSayisi++;

            if(kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre))
            {
                System.out.println("Başarılı giriş!");
            }
            else{
                System.out.println("Kullanıcı adı veya şifre hatalı! Tekrar deneyiniz!!!");
            }

            if(denemeSayisi>maxDeneme)
            {
                System.out.println("Hesabınız kısa süreliğine bloke olmuştur. 3 saniye bekleyiniz.");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                denemeSayisi = 0;
            }
            }

        }

    }

