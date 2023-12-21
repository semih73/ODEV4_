public class personelListesi {
    public static void main(String[] args)
    {
        classPersonel personel1 = new classPersonel();
        classPersonel personel2 = new classPersonel();
        classPersonel personel3 = new classPersonel();
        classPersonel personel4 = new classPersonel();
        classPersonel personel5 = new classPersonel();

        personel1.ad = "Semih";
        personel1.soyad = "Dinler";
        personel1.bolum = "Kalite";
        personel1.tckno = "11234567890";
        personel2.ad = "Hande";
        personel2.soyad = "Dinler";
        personel2.bolum = "Üretim";
        personel2.tckno = "17234567896";
        personel3.ad = "Ahmet";
        personel3.soyad = "Ersoyu";
        personel3.bolum = "Muhasebe";
        personel3.tckno = "28434567896";
        personel4.ad = "Selim";
        personel4.soyad = "İleri";
        personel4.bolum = "İnsan Kaynakları";
        personel4.tckno = "37834567486";
        personel5.ad = "Yaşar";
        personel5.soyad = "Ersoyu";
        personel5.bolum = "Pazarlama";
        personel5.tckno = "98745632109";

        personel1.listele();
        personel2.listele();
        personel3.listele();
        personel4.listele();
        personel5.listele();
    }
}
