package Array_Concept;

public class LenghtArr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int count =0;

        try{
            for(int i=0; ; i++){
                int temp = arr[i];
                count++;
            }
        } catch(ArrayIndexOutOfBoundsException e){

        }
        System.out.println(count);
    }
}
