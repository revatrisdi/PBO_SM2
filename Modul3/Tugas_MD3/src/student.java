public class student {

    private String name;
    private String faculty;
    private String nim;
    private String ProgramStudi;
    private Object[] borrowedBook;

    public void Student( String name, String faculty, String nim, String ProgramStudi){
        this.name = name;
        this.faculty = faculty;
        this.nim = nim;
        this.ProgramStudi = ProgramStudi;
    }





    public void displayinfo(){
        System.out.println(" " + name);
        System.out.println(" " + faculty);
        System.out.println(" " + nim);
        System.out.println(" " + ProgramStudi);
    }


    }
    public static void showBorrowedBook(){
        for (Main.book i : Main.booklist){

    }
    public void displayBook(){

    }
    public void returnBook(){

    }

    static void  loginstudent(){
        boolean validasi = false;
        int loop = 0;
        do{
            Main.inputNIM();
            if(Main.NIM.length() != 15) {
                System.out.println("NIM harus 15 digit\n");
                continue;

            }
            for(Main.Mahasiswa i : Main.userstudent){
                if(i.nim.equals(Main.NIM)){
                    validasi = true;
                    break;
                }
            }
            if(validasi){
                System.out.println("==== Login berhasil ====\n");
                loop = 1;
            }else{
                System.out.println("==== NIM tidak terdaftar ===");
                Main.menu();
            }

        } while(loop == 0);

    }
    static void logout(){
        Main.menu();
    }

    static void showBorrowedBooks(){
        System.out.println("====================================================================================================================================");
        System.out.printf("|| %-25s || %-25s || %-25s || %-20s || %-3s ||\n", "ID Buku", "Nama Buku", "Author", "Category", "Stock");
        System.out.println("\n==================================================================================================================================");

        for(Main.book i : Main.booklist){
            System.out.printf("|| %-25s || %-25s || %-25s || %-20s || %-3s ||\n", i.id, i.namabuku, i.author, i.category, i.stock);
        }

        System.out.println("====================================================================================================================================");

    }
}
