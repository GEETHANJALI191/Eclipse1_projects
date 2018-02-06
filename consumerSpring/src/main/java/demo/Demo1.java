package demo;

public class Demo1 {
public static void main(String[] args){
	try{
	RestTemplate restTemplate=new RestTemplate();
	String result1=restTemplate.getForObject("http://localhost:6666/Spring_HIbernate_Integration/api/demo/hello",String.class,200);
	System.out.println("Result1:"+result1);
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
}
}
