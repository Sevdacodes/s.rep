package Management;

import java.util.HashMap;

public class Ticket {
//public int number;
    int code;
   private String ticketName;
    private String type;
    private int ticketCode;
    private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    private double discountPercent;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(int ticketCode) {
        this.ticketCode = ticketCode;
        switch (ticketCode){
            case 1:
            this.setType("Student");
            this.setDiscountPercent(0.1);
            case 2:
                this.setType("Normal");
                this.setDiscountPercent(1);
            case 3:
                this.setType("private");
                this.setDiscountPercent(0.4);
        }
    }

    public HashMap<Integer, Integer> getMap() {
        return map;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setMap(HashMap<Integer, Integer> map) {
        this.map = map;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }
}
