package Array_Concept;

public class SumSIngleUnit {
    public static void main(String args[]){
        int arr[]={15,16,17,20,55,26,76};
        int num = arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
          while(num >=10){
            sum =0;
            while(num>0){
                sum += num%10;
                num=num/10;
            }
            num=sum;
        }
         System.out.println(num);
        }
       
    }
}
