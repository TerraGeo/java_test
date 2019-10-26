package test.professional.q_n_a;

public class EqualsCallOne {
    public static void main(String[] args) {
        System.out.println("Teddy".equals(null));

        String s = null;

        System.out.println(s == null);
        System.out.println(s.equals(null));
    }
}
