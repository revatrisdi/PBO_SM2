public class student {
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

    static void displaybooks(){
        System.out.println("====================================================================================================================================");
        System.out.printf("|| %-25s || %-25s || %-25s || %-20s || %-3s ||\n", "ID Buku", "Nama Buku", "Author", "Category", "Stock");
        System.out.println("\n==================================================================================================================================");

        for(Main.book i : Main.booklist){
            System.out.printf("|| %-25s || %-25s || %-25s || %-20s || %-3s ||\n", i.id, i.namabuku, i.author, i.category, i.stock);
        }

        System.out.println("====================================================================================================================================");

    }
}
