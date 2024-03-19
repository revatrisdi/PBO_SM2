
import java.util.Scanner;

public class admin {
    static String adminusername = "admin", adminpassword = "admin";
    static Scanner inputuser = new Scanner(System.in);

    static void loginadmin(){
        int adminloop = 0;
        do {
            System.out.println("\n==== Login ====");
            System.out.print("Masukkan Username: \n");
            String username = inputuser.nextLine();

            System.out.print("Massukkan password: \n");
            String password = inputuser.nextLine();

            if (username.equals(admin.adminusername) && password.equals(admin.adminpassword)) {
                System.out.println("==== Login berhasil ====\n");
                adminloop = 1;
            } else {
                System.out.println("==== Pengguna tidak ditemukan ====");
            }
        }while (adminloop == 0);
    }
    static void displaystudent(){
        System.out.println("\n==== Daftar Mahasiswa ====");
        for(Main.Mahasiswa i : Main.userstudent){
            System.out.print("Nama : " +i.nama+ "\n");
            System.out.print("NIM : " +i.nim+ "\n");
            System.out.print("Fakultas : " +i.fakultas+ "\n");
            System.out.print("Prodi : " +i.jurusan+ "\n");
            System.out.println("============================");

        }
        Main.menuadmin();
    }

    static void addstudent(){
        int loop;
        System.out.println("\n==== Tambah Mahasiswa ====");
        System.out.print("masukkan Nama:");
        String nama = inputuser.nextLine();

        String nim;
        do {
            System.out.print("masukkan NIM:");
            nim = inputuser.nextLine();
            if(nim.length() != 15){
                System.out.print("\nNIM harus 15 digit");
                loop = 0;
            }else{
                loop = 1;
            }
        }while(loop == 0);
        System.out.print("masukkan Fakultas:");
        String fakultas = inputuser.nextLine();

        System.out.print("masukkan jurusan:");
        String jurusan = inputuser.nextLine();

        Main.userstudent.add(new Main.Mahasiswa(nama, nim,fakultas, jurusan));
        System.out.println("==== berhasil didaftarkan ====");
        Main.menuadmin();


    }
    static void addbook(){
        Scanner inputuser = new Scanner(System.in);

        System.out.println("\n==== Tambah Buku ====");
        System.out.print("Masukkan id buku: ");
        String id = inputuser.nextLine();

        System.out.print("Masukkan Nama Buku: ");
        String namabuku = inputuser.nextLine();

        System.out.print("Masukkan Nama Author: ");
        String author = inputuser.nextLine();

        System.out.print("Masukkan Kategori Buku: ");
        String category = inputuser.nextLine();

        System.out.print("Masukkan Jumlah Stok Buku: ");
        int stock = inputuser.nextInt();


        Main.booklist.add(new Main.book( id, namabuku, author, category, stock));
        System.out.println("==== Buku berhasil ditambahkan ====");
        Main.menuadmin();
    }


}