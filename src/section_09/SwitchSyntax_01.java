package section_09;

public class SwitchSyntax_01 {
    public static void main(String[]args){
        int num = (int)(Math.random()*10);
        System.out.println(num);

        switch(num){
            case 9 -> System.out.println("大当たりです");
            case 8 -> System.out.println("当たりです");
            default -> System.out.println("はずれ");
        }
    }
}
