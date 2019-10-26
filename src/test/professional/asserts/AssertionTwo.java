package test.professional.asserts;

public class AssertionTwo {
    public static void main(String[] args) {
        int j = 9;
        assert (++j > 7): "Error";
        assert (j == 12): j;
        //assert (++j > 8): System.out.println(j);
        assert j < 2;
        System.out.println(j); //if assertions are disabled the value of j will remain unchanged
    }
}
