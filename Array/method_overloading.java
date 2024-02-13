package Array;

public class method_overloading {
    static float add(float a , float b){
        float sum = a + b;
        return sum;
    }

    static int add(int a , int b){
        int sum = a + b;
        return sum;
    }

    static double add(double a , double b){
        double sum = a + b;
        return sum;
    }
    
    public static void main(String[] args) {
        
        System.out.println(add(12,14));
        System.out.println(add(14f, 2f));
        System.out.println(add(12.22, 222.22));
    }


}
