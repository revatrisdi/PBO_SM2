import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int kondisiloop = 0;
        Scanner inputcase = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        do{
            System.out.print("\n==== Library System ====");
            System.out.print("\n1. Login as student\n2. Login as admin\n3. Exit\n");
            System.out.print("Choose option (1-3): ");

            int inputpilihan = inputcase.nextInt();

            switch (inputpilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");

                    String NIM = input1.nextLine();
                    if (NIM.length() > 15) {
                        System.out.print("User tidak ditemukan\n(NIM lebih dari 15 digit)");

                    } else if (NIM.length() < 15) {
                        System.out.print("User tida ditemukan\n(NIM kurang dari 15 digit)");
                    }else{
                        System.out.print("Login berhasil");
                    }

                    kondisiloop = 1;
                    break;

                case 2:

                    System.out.print("Masukkan Username: \n");
                    String username = input1.nextLine();

                    System.out.print("Massukkan password: \n");
                    String password = input1.nextLine();

                    if (username.equals("admin") && password.equals("admin")) {
                        System.out.print("Login sebagai admin berhasil!");
                    } else {
                        System.out.print("Pengguna tidak ditemukan");
                    }

                    kondisiloop = 1;
                    break;

                case 3:
                    kondisiloop = 0;
                    break;
            }
        }
        while(kondisiloop == 1);

    }
}