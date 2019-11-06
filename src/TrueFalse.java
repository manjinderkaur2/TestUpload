import java.util.Scanner;

public class TrueFalse
{
    boolean invalidpassword(String check) {
        if (check.equals("happy")){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        TrueFalse m=new TrueFalse();
        Scanner use = new Scanner(System.in);
        System.out.print("enter password:");
        String password = use.next();
    }

}
