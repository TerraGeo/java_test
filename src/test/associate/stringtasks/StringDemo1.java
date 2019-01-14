package test.associate.stringtasks;

public class StringDemo1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("OCAJP");
        String s = new String(/*stringBuilder.toCharArray()*/stringBuilder.toString());
        s = s.concat("8");
        System.out.println(s);
    }
}
