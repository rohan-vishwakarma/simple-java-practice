package Array;

public class p1 {
    
    public static void main(String[] args) {
        
        int[][] array  = {{1,2,3,4}, {5,6,7,8}};
        for(int a = 0; a < array.length; a++){
            
            for(int b=0; b < array[a].length; b++){

                System.out.print(array[a][b]);
                System.out.print(" ");

            }
            System.out.println();

        }
    }
}
