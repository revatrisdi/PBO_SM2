import java.util.Scanner;

public class User {
    public void displayBooks() {
        System.out.println("=========================================================================================================================");
        System.out.printf("|| %-25s || %-25s || %-25s || %-20s || %-3s ||", "ID Buku", "Nama Buku", "Penulis", "Kategori", "Stok");
        System.out.println("\n=========================================================================================================================");

        for (Main.BookList i : Main.arr_bookList) {
            System.out.printf("|| %-25s || %-25s || %-25s || %-20s || %-3s  ||\n", i.idbuku, i.judulbuku, i.penulisbuku, i.kategoriBuku, i.stokbuku);
        }

        System.out.print("=========================================================================================================================");

    }

    public void inputBook() {
        Admin adminObj = new Admin();
        Scanner inputuser = new Scanner(System.in);

        System.out.println("\n==== Tambah Buku ====");
        System.out.println("Pilih kategori buku :\n1. History Book\n2. Story Book\n3. Text Book");
        System.out.print("Pilih 1-3: ");
        String pilihan = inputuser.nextLine();

        String idBuku = adminObj.generateId();

        System.out.print("Masukkan judul Buku: ");
        String judulBuku = inputuser.nextLine();

        System.out.print("Masukkan Nama Penulis: ");
        String penulisBuku = inputuser.nextLine();

        System.out.print("Masukkan Jumlah Stok Buku: ");
        int stokBuku = inputuser.nextInt();

        HistoryBook historyBookObj = new HistoryBook(idBuku, judulBuku, penulisBuku, stokBuku);
        StoryBook storyBookObj     = new StoryBook(idBuku, judulBuku, penulisBuku, stokBuku);
        TextBook textBookObj       = new TextBook(idBuku, judulBuku, penulisBuku, stokBuku);
        Book bookObj               = new Book(idBuku, judulBuku, penulisBuku, stokBuku);
        bookObj.setBookId(idBuku);
        bookObj.setTitle(judulBuku);
        bookObj.setAuthor(penulisBuku);
        bookObj.setStock(stokBuku);

        switch (pilihan){
            case "1":
            historyBookObj.setCategory("History Book");
            Main.arr_bookList.add(new Main.BookList(bookObj.getBookId(), bookObj.getTitle(), bookObj.getAuthor(), historyBookObj.getCategory(), bookObj.getStock()));
            break;
            case "2":
            storyBookObj.setCategory("Story Book");
            Main.arr_bookList.add(new Main.BookList(bookObj.getBookId(), bookObj.getTitle(), bookObj.getAuthor(), storyBookObj.getCategory(), bookObj.getStock()));
            break;
            case "3":
            textBookObj.setCategory("Text Book");
            Main.arr_bookList.add(new Main.BookList(bookObj.getBookId(), bookObj.getTitle(), bookObj.getAuthor(), textBookObj.getCategory(), bookObj.getStock()));
            break;
        }
        System.out.println("==== Buku berhasil ditambahkan ====");
    }
}


