public class string_ {
    

    public static void main(String[] args) {
        
        String myname = "Rohan Vishwakarma";
        System.out.println(myname.length());
        System.out.println(myname.charAt(16));
        System.out.println(myname.substring(0,myname.length()/2));
        String Modified = myname.substring(0,myname.length()/2);
        System.out.println(myname.compareTo(Modified));
        String temp = "Rohan Vishwakarma";
        System.out.println(myname.matches(temp));

        System.out.println(myname.replaceAll("R", "m"));
        System.out.println(myname.replace("R", "M"));


        String n1 = "Hello";
        String n2 = "World";

        System.out.println(n1.concat(n2));
        
    }
    

}

