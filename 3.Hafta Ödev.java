public interface OyunKontrolcüsü {
    void kontrolcüEkle();
    void oyunuOynat();
}

public class Xbox implements OyunKontrolcüsü {
    private boolean açıkDurum = false;

    @Override
    public void kontrolcüEkle() {
        System.out.println("Xbox kontrolcüsü eklendi.");
    }

    @Override
    public void oyunuOynat() {
        if (!açıkDurum) {
            throw new RuntimeException("Xbox kapalı, oyun oynatılamaz.");
        }
        System.out.println("Xbox üzerinde oyun başladı.");
    }

    public void aç() {
        if (açıkDurum) {
            throw new RuntimeException("Xbox zaten açık.");
        }
        System.out.println("Xbox şimdi açık.");
        açıkDurum = true;
    }

    public void kapat() {
        if (!açıkDurum) {
            throw new RuntimeException("Xbox zaten kapalı.");
        }
        System.out.println("Xbox kapatılıyor.");
        açıkDurum = false;
    }
}

public class Playstation implements OyunKontrolcüsü {
    private boolean açıkDurum = false;

    @Override
    public void kontrolcüEkle() {
        System.out.println("Playstation kontrolcüsü eklendi.");
    }

    @Override
    public void oyunuOynat() {
        if (!açıkDurum) {
            throw new RuntimeException("Playstation kapalı, oyun oynatılamaz.");
        }
        System.out.println("Playstation üzerinde oyun başladı.");
    }

    public void aç() {
        if (açıkDurum) {
            throw new RuntimeException("Playstation zaten açık.");
        }
        System.out.println("Playstation şimdi açık.");
        açıkDurum = true;
    }

    public void kapat() {
        if (!açıkDurum) {
            throw new RuntimeException("Playstation zaten kapalı.");
        }
        System.out.println("Playstation kapatılıyor.");
        açıkDurum = false;
    }
}

public class Bilgisayar {
    private boolean açıkDurum = false;

    public void aç() {
        if (açıkDurum) {
            throw new RuntimeException("Bilgisayar zaten açık.");
        }
        System.out.println("Bilgisayar şimdi açık.");
        açıkDurum = true;
    }

    public void kapat() {
        if (!açıkDurum) {
            throw new RuntimeException("Bilgisayar zaten kapalı.");
        }
        System.out.println("Bilgisayar kapatılıyor.");
        açıkDurum = false;
    }
}

public class Main {
    public static void main(String[] args) {
        // Test kodları
        Xbox xbox = new Xbox();
        Playstation playstation = new Playstation();
        Bilgisayar bilgisayar = new Bilgisayar();

        xbox.aç();
        xbox.kontrolcüEkle();
        xbox.oyunuOynat();
        xbox.kapat();

        playstation.aç();
        playstation.kontrolcüEkle();
        playstation.oyunuOynat();
        playstation.kapat();

        bilgisayar.aç();
        bilgisayar.kapat();
    }
}
