import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {

        TrueFalse1 g = new TrueFalse1();
        Scanner use = new Scanner(System.in);
        System.out.print("Enter password:");
        String password = use.next();
        boolean result = g.invalidpassword(password);
        System.out.println(result);
        System.out.println();


        class TrueFalse1 {
            String password;

            boolean invalidpassword(String check) {
                if (check.equals("happy")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
