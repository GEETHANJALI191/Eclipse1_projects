package productExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductService {
	private static Map<Integer,Productpojo> products=DataBaseClass.getProduct();

	public ProductService(){
		products.put(1,new Productpojo(1,"geetha"));
		products.put(2,new Productpojo(2,"jeevitha"));
	}
	public List<Productpojo> getAllProducts(){
		return new ArrayList<Productpojo>(products.values());
	}
	/*public Productpojo getProduct(int id){
		return products.get(id);
	}
	public Productpojo addProduct(Productpojo product){
		product.setid(products.size()+1);
		products.put(product.getid(), product);
		return product;
	}*/
}
