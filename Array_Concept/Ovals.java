package Array_Concept;

public class Ovals {
public static void main(String[] args) {
    char[] arr = {'a','b','c','d','e','i','o','g'};
    for(char ch =0; ch<arr.length;ch++){
        char lowerch = Character.toLowerCase(ch);
        if(lowerch=='a' || lowerch=='o' || lowerch=='e' || lowerch=='i' || lowerch=='o'  ){
            System.out.println(ch + " ");
        }
    }
}    
}
