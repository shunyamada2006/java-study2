package section_09;

public class SwitchSyntax_03 {
    public static void main(String[]args){
        int num = (int)(Math.random()*10);
        System.out.println(num);

        switch(num){
            case 0,9 -> {
                System.out.println("大当たり");
                System.out.println("ラッキー");
            }
            case 1,8 ->System.out.println("当たり");
            default -> System.out.println("はずれ");
        }
    }
}
