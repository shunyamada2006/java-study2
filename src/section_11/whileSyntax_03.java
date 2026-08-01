package section_11;

public class whileSyntax_03 {
    public static void main(String[]args){
        int dice = 1;
        int sum = 0;

        while(sum<10){

            dice = (int)(Math.ceil(Math.random()*6));
            System.out.println("さいころの目は"+dice);

            if(dice==4){
                System.out.println("4は加算しません");
                continue;
            }
            sum += dice;
            System.out.println(dice+"を加算:現在の合計は"+sum);
        }
        System.out.println("最終合計は"+sum);
    }
}
