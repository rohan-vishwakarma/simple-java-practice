public class p3 {
    



    public static void main(String[] args) {

        table(2);
    
    }


    public static void table(int num){

        if(num == 0){
            System.out.println("Wrong input");
        }

        int count = 1;

        while(count <= 10){

            System.out.println(num + "*" + count + " = " + num*count);

            count++;
        }
        
    }
}
