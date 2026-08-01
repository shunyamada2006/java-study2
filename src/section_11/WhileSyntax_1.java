package section_11;

public class WhileSyntax_1 {
    public static void main(String[]arg){
        int dice = 1;

        while(dice!=6){
            dice = (int)(Math.ceil(Math.random()*6));
            System.out.println("さいころの目は"+dice);

        }
    }
}
