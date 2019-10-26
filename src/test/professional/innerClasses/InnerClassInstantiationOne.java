package test.professional.innerClasses;

public class InnerClassInstantiationOne {

    public static void main(String[] args) {
        InnerClassInstantiationOne.Tested t = new InnerClassInstantiationOne().new Tested();
        t.x = 2;

        t.in();
    }

    class Tested {
        private int x = 1;

        public void in() {
            System.out.println(x);
        }
    }
}
