package test.professional.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowDoesItWorkDemo2 {
    public static void main(String[] args) {

    }

}
class Test<X> {

    List<Integer> get() {
        return Arrays.asList(1,2,3);
    }

    /*public void go(){
        Test test = new Test<>();
        for (Integer o : test.get()) {

        }
    }*/
}