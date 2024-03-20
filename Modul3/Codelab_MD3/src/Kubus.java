import java.util.Scanner;

public class Kubus extends BangunRuang{


    Scanner scanner = new Scanner(System.in);
    private double sisi, hasil;



    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input sisi: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        hasil = 6 * sisi * sisi;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume(){
        hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}
