import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;



public class Main {
    public static void main(String[] args) {
        String inputnama, inputjeniskelamin, inputtanggallahir, jeniskelaminlengkap;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama:");
        inputnama = input.nextLine();

        System.out.print("Jenis kelamin (L/P):");
        inputjeniskelamin = input.next();
        if(inputjeniskelamin.equalsIgnoreCase("L")){
            jeniskelaminlengkap = "Laki-Laki";
        }else{
            jeniskelaminlengkap = "perempuan";
        }

        System.out.print("Tanggal lahir (dd-MM-yyyy) : ");
        inputtanggallahir = input.next();

        DateTimeFormatter formattanggal = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate tanggallahir = LocalDate.parse(inputtanggallahir, formattanggal);
        LocalDate waktuterkini = LocalDate.now();
        int tahun = Period.between(tanggallahir, waktuterkini).getYears();
        int bulan = Period.between(tanggallahir, waktuterkini).getMonths();

        System.out.format("\nNama : %s\n", inputnama);
        System.out.format("Jenis Kelamin : %s\n", jeniskelaminlengkap);
        System.out.format("Umur anda : %d tahun %d bulan",tahun,bulan);



    }
}