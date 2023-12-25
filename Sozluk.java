import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Sozluk{

    Scanner scan = new Scanner(System.in);
    int secenek;
    public void sec()
    {
        System.out.println("Fiil türünde kelimeleri ve anlamlarını görmek için 1'i tuşlayınız! ");
        System.out.println("İsim türünde kelimeleri ve anlamlarını görmek istiyorsanız 2'yi tuşlayınız!");
        secenek = scan.nextInt();
    }
    private HashMap<String , Kelime> ingilizcedenTurkceye;
    public Sozluk()
    {
        ingilizcedenTurkceye = new HashMap<>();
    }
    String ingilizceKelime , turkceCeviri,tur;
    public void ceviri(String ingilizceKelime , String turkceCeviri , String tur)
    {
        Kelime kelime = new Kelime(turkceCeviri,tur);
        ingilizcedenTurkceye.put(ingilizceKelime,kelime);
    }
    public Kelime ceviriAl(String ingilizceKelime)
    {
        return ingilizcedenTurkceye.get(ingilizceKelime);
    }

    public void turler()
    {
       switch(secenek)
       {
           case 1:
               ceviri("Run", "Koşmak", "fiil");
               ceviri("Accept" , "Kabul etmek" , "fiil");
               ceviri("Bite" , "Isırmak" , "fiil");
               ceviri("Do" , "Yapmak" , "fiil");
               ceviri("Expect" , "Ümit Etmek, Beklemek" , "fiil");
               ekranaBasFiil();
               break;

           case 2:
               ceviri("Access" , " Erişim, ulaşım" , "isim");
               ceviri("Achievement" , "Başarı" , "isim");
               ceviri("Admission" , "Kabul" , "isim");
               ceviri("Country" , "Ülke" , "isim");
               ceviri("Education" , "Eğitim" , "isim");
               ekranaBasİsim();
               break;
       }
    }

    public void ekranaBasFiil()
    {
        System.out.println("FİİL LİSTESİ");

        for (Map.Entry<String, Kelime> entry : ingilizcedenTurkceye.entrySet()) {
            String ingilizceKelime = entry.getKey();
            Kelime kelime = entry.getValue();
            System.out.println("İngilizce: " + ingilizceKelime +
                    " - Türkçe Çeviri ve Tür: " + kelime);
        }
    }
    public void ekranaBasİsim()
    {
        System.out.println("İSİM LİSTESİ");

        for(Map.Entry<String , Kelime> entry : ingilizcedenTurkceye.entrySet())
        {
            String ingilizceKelime = entry.getKey();
            Kelime kelime2 = entry.getValue();
            System.out.println("İngilizce: " + ingilizceKelime +
                    " - Türkçe Çeviri ve Tür: " + kelime2);
        }
    }
}
