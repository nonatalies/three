import java.util.*;

public class lab3 {
    public static void main(String[] args) {
        while(true){
            Scanner str = new Scanner(System.in);
            System.out.print("Input password: ");
            try {
                str.next("^.*(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])([a-zA-Z0-9_]+)$");
                System.out.println("Password is ok");
                str.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Not all requirements match, try again");
            }
        }
    }
}