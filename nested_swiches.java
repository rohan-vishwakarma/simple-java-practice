public class nested_swiches {
    
    public static void main(String[] args) {
        
        String name = "rohan";
        String branch = "MSC";

        switch(name){

            case "rohan":
                switch(branch){

                    case "CSE": System.out.println(name + "Your branch is " + branch);break;
                    case "MSC": System.out.println(name + "Your branch is " + branch);break;

                    default : System.out.println("Invalid Selection , Please try agaub"); break;
                }
                break;

            default: System.out.println("invalid name");
                    
        }

    }

}
