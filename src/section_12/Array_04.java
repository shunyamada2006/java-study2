package section_12;

public class Array_04 {
    public static void main(String[]args){
        boolean[] num = new boolean[101];
        for(int i=0;i<num.length;i++){
            num[i]=true;
        }
        int sosu =2;
        while(sosu<num.length){
            for(int i=sosu+1;i<num.length;i++){
                if(i%sosu==0){
                    num[i]=false;
                }
            }
            sosu++;
        }
        for(int i=2;i<num.length;i++){
            if(num[i]==true){
                System.out.println(i);
            }

        }
    }
}
