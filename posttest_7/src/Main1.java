//Nomor 1
class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo() {
        System.out.println("Nama subclass: " + nama);
        System.out.println("Nama superclass: " + super.nama);
    }
}

public class Main1 {
    public static void main(String[] args) {
        GedungSekolah kelas = new GedungSekolah();
        kelas.tampilkanInfo();
    }
}
