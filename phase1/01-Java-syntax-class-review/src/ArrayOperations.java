
public class ArrayOperations {

	public static void main(String[] args) {

       String[] names = new String[3];
       names [0] = "Blue Shirt";
       names [1] = "Red Shirt";
       names [2] = "Black Shiirt";
       
       int[] numbers = {100,200,300};
       for (String name : names) {
    	   System.out.println("Name: "+ name);
    	   
    	   System.out.println("******************************");
    	   for (int number : numbers) {
    		   System.out.println("Number: "+ number); 
    	   }
       }
	}

}
