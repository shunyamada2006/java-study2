package section_23;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Scanner_Test7 {
    public static void main(String[]args)throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("src/section_23/file.java"));
        while(scanner.hasNext()) {
            String input= scanner.nextLine();
            System.out.println(input);
        }

    }
}
