import java.util.ArrayList;
import java.util.List;

public class ProductStr {
  private final List<Product> list=new ArrayList<>() ;
  
  
  public void initstore() {
	String [] BookNames= {"Java" ,"c","c++","DotNet"};
	double []price= {700,850,450,950};
	int []qunty= {4,5,8,9};
	for (int i = 0; i < BookNames.length; i++) {
		list.add(new Product(i+1,BookNames[i], price[i], qunty[i]));
	}
  }
	public List<Product> getProduct(){
		return list;
	}
	public ProductStr() {
		this.initstore();
}
}
