

import java.io.*;

public class p1 {


    public static void main(String[] args) 
    throws IOException
    {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int int_a = Integer.parseInt(bfn.readLine());
        System.out.println("Entered String : " + str);
        System.out.println("Entered Integer : " + int_a);
    }
    
}



