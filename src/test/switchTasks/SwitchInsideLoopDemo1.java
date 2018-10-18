package test.switchTasks;

public class SwitchInsideLoopDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            switch (i) {
                case 0:
                {break;}
                case 1: {
                    System.out.println(1);
                }
                case 2: {
                    System.out.println(2);
                }
                case 3: {
                    System.out.println(3);
                }
            }
        }
    }
}
