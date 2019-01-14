package test.professional.exceptions2;

public class NestedFinally {
    Integer i;

    public static void main(String[] args) {
        String s;

        try {
            s = new NestedFinally().i.toString();
        } finally {

            try {
                int i = Integer.parseInt("A");
            } catch (NumberFormatException e) {
                System.out.println("NumberFormat");
            } finally {
                System.out.println("Fin2");
            }
            System.out.println("Fin1");
        }
    }
}
