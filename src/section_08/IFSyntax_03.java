package section_08;

public class IFSyntax_03 {
    public static void main(String[]args){
        int num = (int)(Math.random()*10);
        System.out.println(num);

        if(num==9){
            System.out.println("大当たり");
        }else if(num==8){
            System.out.println("あたり");
        }else{
            System.out.println("はずれ");

        }
    }
}
