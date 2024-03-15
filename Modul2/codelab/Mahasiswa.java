import java.lang.String;
import java.util.Scanner;

public class Mahasiswa {
    public String nama, jurusan, nim;
    public static String tampiluniversitas() {
        return "Universitas Muhammadiyah Malang\n";
    }

    public void inputdata(){
        Scanner input1 = new Scanner(System.in);

        System.out.print("Masukkan nama Mahasiswa: ");
        nama = input1.nextLine();
        System.out.print("Masukkan jurusan: ");
        jurusan = input1.nextLine();

        int loop = 0;
        while(loop == 0){

            System.out.print("Masukkan NIM: ");
            nim = input1.nextLine();

            if (nim.length() !=  15) {
                System.out.println("\nNIM harus 15 Digit!\n");

            } else {

                System.out.print("\nData berhasil ditambahkan\n");
                loop = 1;
            }
        }
    }
    public String tampildatamahasiswa() {
        return "Nama: " + nama + "\nJurusan:" + jurusan + "\nNIM: " + nim+  "\n" ;
    }
}


