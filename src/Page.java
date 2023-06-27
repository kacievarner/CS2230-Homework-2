public class Page {

int pageNum;
String tents;

    public Page(int pagenumber, String contents) {
        pageNum = pagenumber;
        tents = contents;
    }

    public String toString() {
        return (tents + " " + "<" + pageNum + ">" );
    }
}
