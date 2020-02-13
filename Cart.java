import java.util.ArrayList;
import java.util.List;

public class Cart extends Cartop{
List<Product> items=new ArrayList<>();
		@Override
		void productByName(String pname) {
			Product product=null;
			  List<Product> products = new ProductStr().getProduct();
		        for (Product prod: products) {
		            if (prod.getName().equalsIgnoreCase(pname)) {
		                product = prod;
		                items.add(product);
		                break;
		            }
		            else {
		            	System.out.println("product is not available");
		            	break;
		        }
		}
		}
		        void printCartItems() {
		        	for (Product pro : items) {
		        		System.out.println( 
		        				"\nProductId:"+ pro.getId()+
		        				"\nName of the product : " +pro.getName()+
		        				"\nPrice: "+pro.getPrice()+
		        				"\nQuantity: "+pro.getQunty());
		        	}
      }
	

}
