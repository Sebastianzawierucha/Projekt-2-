package instr2;
import java.util.Date;

class Film extends media{
    private String duration;

    public Film(int ID, Date publishdate, String author, String publisher, int price, boolean rentstatus, Date rentdate, Date returndate, int CID, Date actualdate) {
        super(ID, publishdate, author, publisher, price, rentstatus, rentdate, returndate, CID, actualdate);
        this.duration = duration;
    }
}