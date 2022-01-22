package theory.exсeptions;

public class Main {
    public static void main(String[] args) {
        try {
            task3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static class MyException extends Exception {

    }
    private static void task3() throws MyException {
        throw new MyException();
    }
}
