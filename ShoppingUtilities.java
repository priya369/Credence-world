import java.util.Scanner;

public class ShoppingUtilities {
public static void main(String[] args) {
	Cart c=new Cart();
	 Scanner sc=new Scanner(System.in);
	 boolean su;
	 String pname;
	 int user_choice;
	 do {
		 System.out.println("1. add product to cart");
		 System.out.println("2.Get cart details" );
		 System.out.println("3.remove product from cart");
		 System.out.println("4.exit");
		 user_choice=sc.nextInt();
	switch (user_choice) {
	case 1:
		 System.out.println("enter product name ");
		 pname=sc.next();
		c.productByName(pname);
		break;
	case 2:
		c.printCartItems();
		break;
	case 3:
		break;
	case 4:
		System.out.println("app close");
	default:System.out.println("OUT OF SERVICE!!");
		break;
	}
	 }while(user_choice!=5);
}
}
