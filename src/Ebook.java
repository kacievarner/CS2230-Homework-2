public class Ebook {
    private final String author;
    private final String title;
    private final String text;
/* you probably won't need to add any more instance variables for this class */

    public Ebook(String t) {
        author = SystemTools.findAuthor(t);
        title = SystemTools.findTitle(t);
        text = t;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }

    public Page getPage(int page, int charactersPerPage) {
        int x = page * charactersPerPage;
        int y;

        if (text.length() % charactersPerPage != 0) {
            y = text.length();
            String z = text.substring(page*charactersPerPage, y);
            return (new Page(page, z));
        }
        String newText = this.text.substring(page * charactersPerPage, page * charactersPerPage + charactersPerPage);
        return (new Page(page, newText));
    }

    public int numPages(int charactersPerPage) {
        if (text.length() % charactersPerPage == 0) {
            int pages = text.length() / charactersPerPage;
            return pages;
        } else{
            int pages = (text.length()/ charactersPerPage) + 1;
            return pages;
        }
    }

    public String toString() {
        return (getAuthor() + " " + getTitle());
    }
}
