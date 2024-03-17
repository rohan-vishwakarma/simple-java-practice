import java.util.Arrays;

public class bubblesort {
    

    public static void main(String[] args) throws Exception {

        int arr[] = {1,6,2, 100,9,3,0, 78};

        int[] temparray = bubblesortfunction(arr);
        System.out.println(Arrays.toString(temparray)); 
        
    }


    public static int[] bubblesortfunction(int array[]) throws Exception{

        if(array.length == 0){
            throw new Exception("length cannot be zero");
        }

        for(int i =0; i<array.length; i++){

            for(int j =0; j < array.length-1; j++){

                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }

        }

        return array;
        
    }

}
