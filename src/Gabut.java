/**
 * @author Muhammad Rizky Yuhari
 * Fitur Applikasinya ga lengkap, karna ngerjain deket amaa deadline wkwkwkw
 * maap :)
 */
public class Gabut {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    static final String[] airline = {"Garuda Airways", "Lion Air"};
    static final int[] discon = {10, 5};

    // ticket price for garuda[0] -> lion[1]
    static final int[] ticketPrice = {800_000, 600_000};

    public static void main(String[] args) {
        viewContent();
    }

    static void viewContent() {
        System.out.println("Program Cetak Tiket Pesawat");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        var cash = input("Uang anda");
        System.out.println("1. Garuda Airways");
        System.out.println("2. Lion Air");

        var chooseAirLine = input("Pilihan Maskapai (Ketik Angka)");

        if ((chooseAirLine == 1 | chooseAirLine == 2)) {


            String passengerName = inputStr("Masukkan nama anda");
            String passengerSex = inputStr("Masukkan jenis kelamin anda (L/P)");


            switch (passengerSex) {
                case "L" -> System.out.println("Selamat Mr." + passengerName + " anda berhasil memesan tiket " + airline[chooseAirLine - 1]);
                case "P" -> System.out.println("Selamat Mrs." + passengerName + " anda berhasil memesan tiket " + airline[chooseAirLine - 1]);
            }
            System.out.println("Uang anda sebesar :" + cash);

            if (chooseAirLine == 1) {
                var temp = calculateDiskon(0);
                System.out.println("Anda mendapatkan diskon sebesar : " + discon[chooseAirLine - 1] + "%,Total yang Harus Anda bayarkan adalah " + temp);
                System.out.println("Sisa uang anda : Rp." + (cash - temp));
            }
            if (chooseAirLine == 2) {
                var temp = calculateDiskon(1);
                System.out.println("Anda mendapatkan diskon sebesar : " + discon[chooseAirLine - 1] + "%,Total yang Harus Anda bayarkan adalah " + temp);
                System.out.println("Sisa uang anda : Rp." + (cash - temp));
            }

        } else {
            System.out.println("Maaf, pesawat yang Anda pilih belum tersedia");
        }

    }


    static int calculateDiskon(int index) {

        return ticketPrice[index] - (ticketPrice[index] * discon[index]) / 100;
    }


    static int input(String info) {
        System.out.print(info + ": ");
        var str = sc.nextInt();
        return str;
    }

    static String inputStr(String info) {
        System.out.print(info + ": ");
        var str = sc.next();
        return str;
    }
}
