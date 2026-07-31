package section_09;

public class SwitchSyntax_05 {
    public static void main(String[]args){
        int age = 26;
        age = age / 10;
        //System.out.println(age);
        String kin = "";

        kin = switch(age){
            case 1 -> "1000円";
            case 2 -> "2000円";
            case 3,4 -> "3000円";
            case 5 -> "4000円";
            default -> "500円";
        };
        System.out.println(kin);
    }
}
