
public class SwitchStringStatement {

	public static void main(String[] args) {
		String Key = "Blue";
		String Shirt = "Shirt";
    switch (Key) { 
    case "Red": 
    	Shirt = "Red "+ Shirt;
    	break ;
    	default :
    		Shirt = "White " + Shirt;
    		break;
    		
    		
    }System.out.println("Shirt Type : "+Shirt);
	}

}
