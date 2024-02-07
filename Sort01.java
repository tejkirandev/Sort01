import java.util.Arrays;
public class Sort01 {
    public static void main(String[] args) {
        int [] arr={1,0,1,0,0,1,1,1,0};//input array
        int count=countZeros(arr);//counting the number of zeroes present in the array
        //updating the array ba
        for (int i = 0; i < arr.length; i++) {
            if(count>0) {
                arr[i]=0;
                count--;
            }else{
                arr[i]=1;
            }
            

        }
        System.err.println(Arrays.toString(arr));

    }
    static int countZeros(int[] arr)
    {
        int count=0;
        for (int i : arr) {
            if(i==0)
            {
                count++;
            }
        }
        return count;
    }
    
}
