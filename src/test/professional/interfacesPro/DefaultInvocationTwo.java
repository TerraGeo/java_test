package test.professional.interfacesPro;

public class DefaultInvocationTwo {
    public static void main(String[] args) {
        Move.getSpeed();
    }

    interface Move {
        public static int getSpeed() {
            return 10;
        }

        /*default String toString() {
            return "move";
        }*/
    }
}
