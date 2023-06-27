/* UNCOMMENT THIS FILE WHEN YOU ARE READY


import java.net.MalformedURLException;
import java.net.URL;

public class ReaderExample {

    public static void main(String[] args) throws MalformedURLException {
        // An example interation with the EbookReader that you can try
        // once all the methods are complete and working
        URL alice = new URL("https://www.gutenberg.org/files/11/11-0.txt");
        URL frankenstein = new URL("https://www.gutenberg.org/files/84/84-0.txt");
        URL treasureIsland = new URL("https://www.gutenberg.org/files/120/120-0.txt");
        URL beowulf = new URL("http://www.gutenberg.org/cache/epub/16328/pg16328.txt");

        Reader reader = new Reader(6, 250);
        reader.addBook(alice);
        reader.addBook(frankenstein);
        reader.addBook(treasureIsland);

        System.out.println("\nBooks in library");
        reader.printTitles();
        System.out.println("\n");

        reader.openBook(1);
        int page = 40;
        reader.turnToPage(page);
        System.out.println("Page "+page+" of "+reader.titleOfBook()+" by "+reader.authorOfBook());
        System.out.println(reader.readPage());

        reader.deleteBook(1);
        reader.addBook(beowulf);

        System.out.println("\nBooks in library");
        reader.printTitles();
        System.out.println("\n");

        reader.openBook(1);
        page = 77;
        reader.turnToPage(page);
        System.out.println("Page "+page+" of "+reader.titleOfBook()+" by "+reader.authorOfBook());
        System.out.println(reader.readPage());
    }
}
*/