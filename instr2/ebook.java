package instr2;
import java.util.Date;

class Ebook extends media{
    private int filesize;

    public Ebook(int ID, Date publishdate, String author, String publisher, int price, boolean rentstatus, Date rentdate, Date returndate, int CID, Date actualdate) {
        super(ID, publishdate, author, publisher, price, rentstatus, rentdate, returndate, CID, actualdate);
        this.filesize = filesize;
    }
}