package entity;

public class RateCard {

    private long start;
    private long end;
    private double amount;

    public RateCard(long start) {
        this.start = start;
        this.amount = 30; //setting default amount to 30
    }

    public RateCard(long start, long end, double amount) {
        this.start = start;
        this.end = end;
        this.amount = amount;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public double getAmount() {
        return amount;
    }
}