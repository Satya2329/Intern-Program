package Array_Concept;

public class Zerop {
    public static void main(String[] args) {
        int arr[] = {0,1,2,9,0,23,25,120};
        int zerocount =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==0){
                zerocount++;
            }
        }
        System.out.println("The no. of zeros are" +" " + zerocount);
    }
    
}
