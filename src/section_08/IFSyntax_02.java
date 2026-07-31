package section_08;

public class IFSyntax_02 {
    public static void main(String[]args){
        int num = (int)(Math.random()*10);
        System.out.println(num);

        if(num==9){
            System.out.println("大当たり");
        }
        else{
            System.out.println("はずれ");
        }
    }
}
