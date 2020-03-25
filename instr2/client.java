package instr2;

import java.util.Date;

public class client {
    private String name;
    private String surname;
    private int CID;
    private String adress;
    private int age;
    private Date joindate;
    private boolean block;
    private int personalcharge;     //wartosc naliczonych oplat

    public client(String name, String surname, int CID, String adress, int age, Date joindate, boolean block, int personalcharge) {
        this.name = name;
        this.surname = surname;
        this.CID = CID;
        this.adress = adress;
        this.age = age;
        this.joindate = joindate;
        this.block = block;
        this.personalcharge = personalcharge;
    }

    public void blocking(){ // funkcja odpowiedzialna za blokowanie uzytkownika
        if(this.personalcharge > 10){
            block = true;
            System.out.println("Klient ma zablokowana mozliwosc wypozyczania");
        }
    }
}
