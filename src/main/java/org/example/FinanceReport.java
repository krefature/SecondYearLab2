package org.example;

public class FinanceReport {
    private Payment[] pays;
    private String fio;
    private int[] date;

    public FinanceReport(Payment[] pays, String fio, int[] date) {
        this.pays = pays;
        this.fio = fio;
        this.date = date;
    }
    public int getQuantityPayments(){
        return pays.length;
    }
    public Payment qetPayment(int index){
        return pays[index];
    }
    public void setPayment(int index,Payment payment){
        pays[index] = payment;
    }
    @Override
    public String toString(){
        String Pays = "";
        for (int index = 0;index<pays.length;index++){
            Pays += pays[index].toString();
            Pays += "\n";
        }

        return String.format("[Автор: %s, дата: %d.%d.%d" +
                "\nПлатежи: [\n%s ... ]]",
                fio,date[0],date[1],date[2], Pays);
    }
}
