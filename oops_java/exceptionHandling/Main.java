package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            // divide(4, 0);
            // throw new Exception("Just for fun");
            String name = "Kunal";
            if (name.equals("Kunal")) {
                throw new MyException("Name is kunal");
            }

        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }

        return a / b;
    }
}
