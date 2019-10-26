package test.professional.asserts;

public class AssertionThree {
    static {
        boolean assertsEnabled = false;
        assert assertsEnabled = true;
        if (!assertsEnabled)
            throw new RuntimeException("stop!");
    }

    public static void main(String[] args) {

    }
}
