package instr2;
import java.util.Date;      //biblioteka obsługi dat


public class media {        //klasa bazowa wypozyczalni
    private int ID;
    private Date publishdate;
    private String author;
    private String publisher;
    private int price;
    private boolean rentstatus;     //status wypozyczenia
    private Date rentdate;          //data wypozyczenia
    private Date returndate;        //data zwrotu
    private int CID;                //ID klienta ktory wypozyczyl
    Date actualdate = new Date();   //generacja aktualnej daty

    public media(int ID, Date publishdate, String author, String publisher, int price, boolean rentstatus, Date rentdate, Date returndate, int CID, Date actualdate) { //konstruktor klasy bazowej
        this.ID = ID;
        this.publishdate = publishdate;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.rentstatus = rentstatus;
        this.rentdate = rentdate;
        this.returndate = returndate;
        this.CID = CID;
        this.actualdate = actualdate;
    }

    public void charging(){     //funkcja odpowiedzialna za naliczanie oplat za zwloke
        Date diff = new Date(this.actualdate.getTime() - this.returndate.getTime());        //roznica w datach podana w milisekundach
        int charge = diff/100000;
        if (this.returndate.after(this.actualdate)) {
            System.out.println("Do zaplaty pozostalo"+charge+"");
        }
    }
}


