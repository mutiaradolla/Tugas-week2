
package tugas.javalab2;

public class Lampu {
     //atribut
    boolean nyala;
    
    //method
    void nyalakanLampu(){
        nyala = true;
    }
    void matikanLampu(){
        nyala = false;
    }


 
    public static void main(String[] args) {
        //membuat objek
        Lampu lampu1 = new Lampu();
        lampu1.nyalakanLampu();
        System.out.println("Apakah lampu menyala?"+lampu1.nyala);
        lampu1.matikanLampu();
        System.out.println("Apakah lampu menyala?"+lampu1.nyala);
    }
}
