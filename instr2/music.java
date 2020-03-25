package instr2;
import java.util.Date;

class Music extends media {
    private int songs;

    public Music(int ID, Date publishdate, String author, String publisher, int price, boolean rentstatus, Date rentdate, Date returndate, int CID, Date actualdate) {
        super(ID, publishdate, author, publisher, price, rentstatus, rentdate, returndate, CID, actualdate);
    }
}
