package section_14;

public class Methoodplus_03 {
    public static void main(String[]args){
        test(123);
        test(1.23F);
        test(123,1.23F);
        test(1.23F,123);
    }
    public static void test(int i){
        System.out.println("①int型:"+i);
    }
    public static void test(float f){
        System.out.println("②float型:"+f);
    }
    public static void test(int i,float f){
        System.out.println("③int型"+i+"/float型:"+f);
    }
    public static void test(float f,int i){
        System.out.println("④float型:"+f+"/int型"+i);
    }
}
