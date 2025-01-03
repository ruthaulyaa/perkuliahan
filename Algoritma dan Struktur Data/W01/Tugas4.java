import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

interface Book {
    public String getAuthor();

    public String getTitle();

    public String getISBN();
}

class NewBook implements Book {

    private String author;
    private String title;
    private String ISBN;

    public NewBook() {
    }

    public NewBook(final String author, final String title, final String ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    public NewBook(final NewBook book) {
        this.author = book.author;
        this.title = book.title;
        this.ISBN = book.ISBN;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getISBN() {
        return this.ISBN;
    }

}

class BookInfo extends NewBook {

    private LocalDate dueDate;
    private String currentHolder;

    public BookInfo(final String author, final String title, final String ISBN) {
        super(author, title, ISBN);
        currentHolder = null;
        dueDate = null;
    }

    public BookInfo(final BookInfo book) {
        super(book.getAuthor(), book.getTitle(), book.getISBN());
        currentHolder = null;
        dueDate = null;
    }

    public  LocalDate getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(final  LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getCurrentHolder() {
        return this.currentHolder;
    }

    public void setCurrentHolder(final String currentHolder) {
        this.currentHolder = currentHolder;
    }

    @Override
    public String toString() {
        return "Author: " + super.getAuthor() + "\n" + "Judul: " + super.getTitle() + "\n" + "ISBN: " + super.getISBN()
                + "\n" + "Peminjam: " + getCurrentHolder() + "\n" + "Batas Peminjaman: " + getDueDate();
    }

}

interface LibraryBook {
    public Boolean addBookToLibrary(BookInfo book);

    public Boolean checkOutABook(String ISBN, String newHolder,  LocalDate date);

    public Book currentHolder(String ISBN);
}

class Library implements LibraryBook {

    ArrayList<BookInfo> books = new ArrayList<BookInfo>();

    public Boolean addBookToLibrary(final BookInfo book) {
        books.add(book);
        return true;
    }

    public Boolean checkOutABook(final String ISBN, final String newHolder, final  LocalDate date) {
        final BookInfo book = new BookInfo(currentHolder(ISBN));
        if (book == null) {
            System.out.println("Book is not found!");
            return false;
        } else {
            book.setCurrentHolder(newHolder);
            book.setDueDate(date);
            return true;
        }
    }

    public BookInfo currentHolder(final String ISBN) {

        for (final BookInfo item : books) {
            if (ISBN.equals(item.getISBN())) {
                return item;
            }
        }
        return null;
    }

    public Integer totalBook() {
        return books.size();
    }

    public void printBook() {
        for (final BookInfo item : books) {
            System.out.println(item);
            System.out.println("=======================");
        }
    }

    public void printBookSearch(final String search) {
        for (final BookInfo item : books) {
            if (item.getAuthor().contains(search) || item.getTitle().contains(search)
                    || item.getISBN().contains(search)) {
                System.out.println(item);
                System.out.println("=======================");
            }
        }
    }

}

public class Tugas4 {

    private static Library lib = new Library();

    private static void opsi1() {
        // System.out.print("\033\143");

        final Scanner sc = new Scanner(System.in);

        String author;
        String title;
        String isbn;
        System.out.println("Tambah Koleksi Buku");
        System.out.println("=======================");
        System.out.print("Inputkan Author Buku => ");
        author = sc.nextLine();
        System.out.print("Inputkan Judul Buku => ");
        title = sc.nextLine();
        System.out.print("Inputkan ISBN Buku => ");
        isbn = sc.nextLine();

        final BookInfo book = new BookInfo(author, title, isbn);

        if (lib.currentHolder(isbn) == null) {
            lib.addBookToLibrary(book);
            System.out.println("Buku berhasil ditambahkan!");
        } else {
            System.out.println("Buku tidak dapat ditambahkan, karena sudah terdaftar di dalam perpustakaan!");
        }

        System.out.println("");
        System.out.println("Tekan enter untuk melanjutkan...");
        sc.nextLine();
        // System.out.print("\033\143");
    }

    private static void opsi2() {
        final Scanner sc = new Scanner(System.in);
        // System.out.print("\033\143");

        System.out.println("Koleksi Buku [" + lib.totalBook() + " Buah]");
        System.out.println("=======================");

        lib.printBook();

        System.out.println("");
        System.out.println("Tekan enter untuk melanjutkan...");
        sc.nextLine();
        // System.out.print("\033\143");
    }

    private static void opsi3() {
        final Scanner sc = new Scanner(System.in);
        // System.out.print("\033\143");s
        System.out.print("Cari Buku => ");
        final String search = sc.nextLine();

        System.out.println("Koleksi Buku dari hasil pencarian " + search);
        System.out.println("=======================");

        lib.printBookSearch(search);

        System.out.println("");
        System.out.println("Tekan enter untuk melanjutkan...");
        sc.nextLine();
        // System.out.print("\033\143");
    }

    private static void opsi4() {
        final Scanner sc = new Scanner(System.in);
        // System.out.print("\033\143");s
        System.out.print("Masukkan ISBN Buku yang ingin dipinjam => ");
        final String isbn = sc.nextLine();

        if (lib.currentHolder(isbn) != null) {


            if(lib.currentHolder(isbn).getCurrentHolder() == null){
                System.out.print("Masukkan Nama Peminjam Buku => ");
                final String peminjam = sc.nextLine();
                LocalDate now = LocalDate.now().plusDays(7);

                lib.currentHolder(isbn).setCurrentHolder(peminjam);
                lib.currentHolder(isbn).setDueDate(now);

                System.out.println("Berhasil meminjam buku, silakan mengembalikan buku sebelum tanggal " + now);
            }else{
                System.out.println("Gagal meminjam buku. Buku telah dipinjam oleh " + lib.currentHolder(isbn).getCurrentHolder());
            }
            
        } else {
            System.out.println("ISBN buku dengan nomor " + isbn + " tidak ditemukan");
        }

        System.out.println("");
        System.out.println("Tekan enter untuk melanjutkan...");
        sc.nextLine();
        // System.out.print("\033\143");
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        Boolean exit = false;

        do {
            System.out.println("=========================");
            System.out.println("1] Tambah Koleksi Buku");
            System.out.println("2] Lihat Semua Buku");
            System.out.println("3] Cari Buku");
            System.out.println("4] Pinjam Buku");
            System.out.println("5] Keluar");
            System.out.println("=========================");
            System.out.print("Inputkan pilihan => ");
            System.out.println("Welcome to "" Library");
            final Integer action = sc.nextInt();

            switch (action) {
            case 1:
                opsi1();
                break;
            case 2:
                opsi2();
                break;
            case 3:
                opsi3();
                break;
            case 4:
                opsi4();
                break;
            default:
                System.out.println("Bye.");
                exit = true;
            }

        } while (exit == false);

    }

}