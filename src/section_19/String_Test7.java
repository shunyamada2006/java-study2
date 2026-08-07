package section_19;

public class String_Test7 {
    public static void main(String[]args){
        String moji2 ="なにぬ,まみむ,やゆよ,わをん" ;

        String[] array2=moji2.split(",",3);

        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }
}
