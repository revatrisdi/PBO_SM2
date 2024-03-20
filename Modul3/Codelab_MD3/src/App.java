public class App {
    public static void main(String[] args) {
        Tabung tabung = new Tabung();
        Kubus kubus = new Kubus();
        Balok balok = new Balok();


        tabung.setName("Tabung");
        kubus.setName("Kubus");
        balok.setName("Balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}
