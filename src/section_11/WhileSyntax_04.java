package section_11;

public class WhileSyntax_04 {
    public static void main(String[]args){
        int dice =1;

        while(dice!=1){
            dice = (int)(Math.ceil(Math.random()*6));
            System.out.println("[while]さいころの目は"+dice);
        }
        do{
            dice = (int)(Math.ceil(Math.random()*6));
            System.out.println("[do-while]さいころの目は"+dice);
        }while(dice!=1);
    }
}
