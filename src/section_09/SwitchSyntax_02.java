package section_09;

public class SwitchSyntax_02 {
    public static void main(String[]args){
        int num = (int)(Math.random()*10);
        System.out.println(num);

        switch(num){
            case 0,9 -> System.out.println("大当たり");
            case 1,8 -> System.out.println("当たり");
            default -> System.out.println("はずれ");
        }
    }
}
