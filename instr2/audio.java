package instr2;
import java.util.Date;

class Audio extends media{
    private int parts;

    public Audio(int ID, Date publishdate, String author, String publisher, int price, boolean rentstatus, Date rentdate, Date returndate, int CID, Date actualdate) {
        super(ID, publishdate, author, publisher, price, rentstatus, rentdate, returndate, CID, actualdate);
        this.parts = parts;
    }
}
