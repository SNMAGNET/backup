/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Person {

public static int count =0;
public String name = null;
private int age = 0;
private String mail= null;
private String address =null;
private int tell =0;

  public Person(String name,
		         int age,
		         String mail,
		         String address,
		         int tell){
	  this.name=name;
	  this.age=age;
	  this.mail=mail;
	  this.address=address;
	  this.tell=tell;
	  count++;
  }

  public String getName(){
	  return  this.name;
  }
  public void setName(String name){
	  this.name = name;
  }


  public int getAge(){
	  return  this.age;
  }
  public void setAge(int age){
	  this.age = age;
  }


  public String getMail(){
	  return  this.mail;
  }
  public void setMail(String mail){
	  this.mail = mail;
  }


  public String getAddress(){
	  return  this.address;
  }
  public void setAddress(String address){
	  this.address = address;
  }



  public int getTell(){
	  return  this.tell;
  }public void setTell(int tell){
	  this.tell = tell;
  }

}
