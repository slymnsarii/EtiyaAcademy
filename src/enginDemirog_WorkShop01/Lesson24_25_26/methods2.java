package enginDemirog_WorkShop01.Lesson24_25_26;

public class methods2 {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int toplam = topla2(1,2,3,4,5,6);
        System.out.println(toplam);
    }

    public static void ekle(){

        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");

    }

    public static void guncelle(){
        System.out.println("Güncellendi");

    }


    public static String sehirVer(){
        return "ankara";
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){

            toplam+=sayi;
        }
        return toplam;
    }

}
