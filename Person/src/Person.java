/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Person {
	public String name =null;
	//* nullは”０”、”空”。基礎の型なので初期値はなしとするのが一般的。
	public int age = 0;

	public void talk(){
		System.out.println(this.name+"が話す");
	}
	public void walk(){
		System.out.println(this.name+"が歩く");
	}
	public void run(){
		System.out.println(this.name+"が走る");
	}

	}

/* コンストラクタ：コピーの窓口。
　Person=new Person”();”の””で囲んだ部分に相当する。
　public Person(String name , int age){
this.name=name; this.age=age;}という形で記述する。*/