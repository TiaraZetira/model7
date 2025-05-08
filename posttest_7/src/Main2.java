//Nomor 2
class Orang {
    Orang() {
        System.out.println("Orang dibuat");
    }
}

class Dosen extends Orang {
    Dosen() {
        super(); 
        System.out.println("Dosen dibuat");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dosen d = new Dosen();
    }
}
