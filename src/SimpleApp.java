/**
 * @author Muhammad Rizky Yuhari
 * maap programnya cupu wkwk
 */
public class SimpleApp{
    public static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        view();


    }


    static void view(){
        System.out.println("Silahkan Isi data dibawah untuk mendapatkan Grade nilai kelulusan");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("Nama :");
        var name = sc.next();
        //niali matkul
        System.out.print("Dasar - Dasar Pemograman :");
        var ddp = sc.nextInt();
        System.out.print("Dasar - Dasar Jaringan :");
        var ddj = sc.nextInt();
        var mean = calculateMean(ddp,ddj);
        System.out.println(mean);

        char grade ;

        if(mean >= 90 && mean <= 100) grade = 'A';
        else if((mean >= 80 && mean < 90)) grade = 'B';
        else if((mean >= 70 && mean < 80)) grade = 'C';
        else grade = 'D';


        switch(grade){
            case 'A' -> System.out.println("Selamat "+ name +", Anda telah lulus dengan predikat Sempurna (A)");
            case 'B' -> System.out.println("Selamat "+ name +", Anda telah lulus dengan predikat baik (B)");
            case 'C' -> System.out.println("Selamat "+ name +", Anda telah lulus dengan predikat cukup (C)");
            case 'D' -> System.out.println("Maaf "+ name + ", Anda Belum Lulus (D)");
        }

    }

    static int calculateMean(int ddp, int ddj){
        return (ddp + ddj)/2;
    }
}
