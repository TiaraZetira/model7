class kendaraan {
    String merk = "Toyota";

    kendaraan(){
        System.out.println("ini constraktor parent: ");

    }
    void jalan() {
        System.out.println("kendaraan sedang berjalan");
    }
}

class mobil extends kendaraan {
    String merk = "BMW";
    mobil(){
        super();
        System.out.println("ini constraktor child");
    }
    void printInfo(){
        System.out.println("merk mobil parent: " + merk);
        System.out.println("merk mobil child: " + super.merk);
        jalan();
    }
    void klakson(String merk) {
        System.out.println("mobil " + super.merk + " klakson");
    }
}

public class main{
    public static void main(String[] args){
        mobil jazz = new mobil();
        jazz.jalan();
        jazz.klakson("BMW");
        jazz.printInfo();
    }
}