package test.professional.enums;

public class EnumOrdinalOne {
    public static void main(String[] args) {
        System.out.println(EnumOrdinal.WIN.ordinal());
    }
}

enum EnumOrdinal {
    /*LOS{
        @Override
        public String toString() {
            return super.toString();
        }

        public void print() {
            System.out.println("Some text");
        }
    }*/
    LOSS(0), WIN(2), TIE(1);

    private int points;

    EnumOrdinal(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
