
public class StringOperations {

	public static void main(String[] args) {
StringBuilder sb = new StringBuilder("Hello");
         System.out.println("String sb: "+ sb);
         sb.append( " World");
         System.out.println("String sb: "+ sb);
         
         sb.append("!").append(" How").append(" are").append(" You?");
         System.out.println("String sb: "+ sb);
         System.out.println("String Lentgh: "+ sb.length());
         //Get SubString
         System.out.println("SubString: "+ sb.substring(0, 5));
         
	}

}
