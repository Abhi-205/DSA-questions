import java.util.*;
public class countVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vowels=0 , consonants =0;

        for(int i=0 ; i<str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consontants : "+consonants);
        sc.close();
    }
}
