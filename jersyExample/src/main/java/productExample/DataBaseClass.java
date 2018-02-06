package productExample;
import java.util.HashMap;
import java.util.Map;

public class DataBaseClass {
private static Map<Integer,Productpojo> products=new HashMap();
public static Map<Integer,Productpojo> getProduct(){
	return products;
}
}
