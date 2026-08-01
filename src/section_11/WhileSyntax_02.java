package section_11;

public class WhileSyntax_02 {
    public static void main(String[]args){

        int dice = 1;
        int cnt =0;

        while(dice!=6){

            if(cnt>=5){
                System.out.println("5回に達したため強制終了します");
                break;
            }
            dice = (int)(Math.ceil(Math.random()*6));
            System.out.println("さいころの目は"+dice);
            cnt++;
        }
    }
}
