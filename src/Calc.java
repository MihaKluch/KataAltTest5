import java.util.Scanner;

public class Calc {

    static String userInput;
    public static void main(String[] args) {

        System.out.println("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String userInput = scanner.nextLine();
            System.out.println(Parser.userOtput(userInput));
        }catch (MyExcepcion e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("произошла ошибка");
        }
    }


}
