package section_23;
import java.util.Scanner;
public class Scanner_Test4 {
    public static void main(String[]args){
        System.out.println("小数点を含んだ数値を入力しましょう");
        Scanner scanner = new Scanner(System.in);
        Double input=scanner.nextDouble();
        System.out.println("入力した少数は"+input);
        scanner.close();
    }
}
