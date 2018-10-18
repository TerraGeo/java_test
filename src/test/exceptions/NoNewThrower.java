package test.exceptions;

public class NoNewThrower {
    public static void main(String[] args) throws Exception{
        try {
            System.out.println("try Started ");
            throw new Exception();
        } catch (Exception e) {
            throw e;
        }finally {
            System.out.println("Finally Completed");
        }
    }
}
