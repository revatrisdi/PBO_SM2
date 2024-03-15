import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        ArrayList<Mahasiswa> daftarmahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        while(pilihan != 3) {
            System.out.print("\n1. Tambah data Mahasiswa \n2. Tampilkan data Mahasiswan \n3. Keluar\n");

            System.out.print("Pilihan anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    Mahasiswa inputmahasiswa = new Mahasiswa();
                    inputmahasiswa.inputdata();

                    if (inputmahasiswa.nim.length() == 15) {
                        daftarmahasiswa.add(inputmahasiswa);
                    }
                    break;

                case 2:
                    System.out.print("\nData mahasiswa\n");
                    System.out.println(Mahasiswa.tampiluniversitas());

                    for (Mahasiswa listdata : daftarmahasiswa) {
                        System.out.println(listdata.tampildatamahasiswa());
                    }
                    break;

                case 3:
                    break;


            }
        }
    }
}