package springcore3;

public class customer 
{
 private int id;
 private String name;
 private String email;
 private address adr;
 
 
public customer() {
	
}
public customer(int id, String name, String email, address adr) {
	
	this.id = id;
	this.name = name;
	this.email = email;
	this.adr = adr;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public address getAdr() {
	return adr;
}
public void setAdr(address adr)
{
	this.adr = adr;
}
public void display()
{
	System.out.println("id :"+id+" Name :"+name+" email:"+ email+" ");
			adr.details();
}
}
	

 
 


