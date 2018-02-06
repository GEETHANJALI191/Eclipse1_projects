package productExample;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Productpojo {
  private int id;
  private String name;
public Productpojo()
{
	
}
public Productpojo(int id, String name) {
	//super();
	this.id = id;
	this.name = name;
}
public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}
  
  
}
