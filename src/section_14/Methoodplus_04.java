package section_14;

public class Methoodplus_04 {
    public static void main(String[]args){

        int[] scoreArray = {70,85,90,95,80,120,10,29,72,65};

        for(int score:scoreArray){
            System.out.println(score+"点で成績は"+getGrade(score));
        }
    }
    public static char getGrade(final int score){
        char grade ='C';
        if(score<0||score>100){
            return '-';
        }
        if(score>=90){
            grade ='A';
        }else if(score>=80){
            grade ='B';
        }
        return grade;
    };
}
