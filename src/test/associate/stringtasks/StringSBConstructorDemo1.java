package test.associate.stringtasks;

public class StringSBConstructorDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ab");
        sb.append("cd");
        String s = new String(sb);
        s.concat("ef");
        System.out.println(s);
    }
}
