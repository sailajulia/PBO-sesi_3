public class Looping5 {
    public static void main(String[] args) {
       
        int angka = 1;
        int jumlah = 1;

        for (int i = 1; i <= 8; i++) {
            System.out.print(angka + " ");

            jumlah++;
            angka += jumlah;
        }
    }
}

