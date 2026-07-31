package section_08;

public class IFSyntax_04 {
    public static void main(String[]args){
        int num = (int)(Math.random()*10);
        System.out.println(num);

        if((1<num)&&(3<num)){
            System.out.println("randNumは1より大きい、かつ3より小さい値です");
        }else{
            System.out.println("and条件が成り立ちません");
        }

        if((1==num) || (3==num)){
            System.out.println("randNumは1、または3です");
        }else{
            System.out.println("or条件が成り立ちません");
        }

    }
}
