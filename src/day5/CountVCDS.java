package day5;

public class CountVCDS {
public static void solution(String s){
    s=s.toLowerCase();

    String vowels="aeiou";
    String decimal="0123456789";
    String specialsChars="!@#&()";
    String consonents="bcghfd";

    int vowelsCount =0;
    int decimalCount=0;
    int consonentsCount=0;
    int specialCharsCount=0;

    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(vowels.contains(Character.toString(ch))){
            vowelsCount++;


        }else if (decimal.contains(Character.toString(ch))) {
            decimalCount++;
            
        }else if(specialsChars.contains(Character.toString(ch))){
            specialCharsCount++;
        }else{
            consonentsCount++;
        }
    }
    System.out.println("count of vowels:" +vowelsCount);
    System.out.println("count of decimals:"+decimalCount);
    System.out.println("count of consonents:"+consonentsCount);
    System.out.println("count of specialCharsCount:"+specialCharsCount);
}

    public static void main(String[] args) {
        String s="aeioubcdfg&$@!1234";

        System.out.println(solution(s));
    }
    
    
}
