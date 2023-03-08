
package tugas.javalab2;

public class AksiSepeda {
    public static void main(String[] args) {
        Sepeda sepedaBalap = new Sepeda(2, "Gunung", "Polygon");
        Sepeda sepedaBayi = new Sepeda(3, "Sepeda Bayi", "Miami");
        Sepeda sepedaLipat = new Sepeda(2, "Sepeda Lipat", "Gun");

        //mengakses atribut dan method
        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah gear "+gearSepeda);
        sepedaBalap.ngerem();

    }
}
