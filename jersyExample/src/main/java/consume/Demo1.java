package consume;

import org.springframework.web.client.RestTemplate;

public class Demo1 {
	public static void main(String[] args){
		
		RestTemplate restTemplate=new RestTemplate();
		String url="http://localhost:8013/jersyExample/webapi/myresource";
		String result1=restTemplate.getForObject(url,String.class);
		System.out.println("Result1:"+result1);
	}
}
