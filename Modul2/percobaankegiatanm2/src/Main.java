import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Arraylist<book> booklist = new ArrayList<>();
    static Arraylist<Mahasiswa> userstudent = new ArrayList<>();
    static Scanner inputswitchcase = new Scanner (System.in);
    static Scanner inputuser = new Scanner (System.in);


    static void menu(){
        int menuloop = 0;
        do{
            System.out.println("====Library System====");
            System.out.print("1. Login as student\n 2. Login as admin\n 3. Exit");
            System.out.println("choose option (1-3): ");
             int pilihan = inputswitchcase.nextInt();
             switch (pilihan) {
                 case 1:
                     student.loginstudent();
                     menustudent();
                     break;
                 case 2:
                     admin.loginadmin();
                     menuadmin;
                     break;
                 case 3:
                     menuloop = 1;
                     break;

             }
        } while (menuloop == 0);
    }
    static void inputNIM(){
        System.out.println("Masukkan NIM: ");
        NIM = inputuser.nextLine();
    }



}