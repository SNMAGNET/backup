/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Person {

	String name = null;
	int age = 0;
	int SENTOURYOKU = 0;

	/*　上のSring name = null;
	 * などのものをフィールド変数という
	 * これはクラスの中で自由に使える値とその初期値を定めている
	 */

	public Person(String name,
			      int age,
			      int SENTOURYOKU
			      /*こちらのものはローカル変数といい、
			      このコンストラクタのなかでしか使えない*/)
	{
	this.name
	/* this.nameのthisを使う理由は同じ名前での衝突を避けるため
	ローカル変数の名称変更を避ける理由はわかりにくくなるため（？）*/ = name;
	this.age = age;
    this.SENTOURYOKU = SENTOURYOKU;



	}

	public Person(String name,
			      int SENTOURYOKU)
{
this.name = name;
this.age=34;
this.SENTOURYOKU=SENTOURYOKU;

}
	public Person(int age,String name)
{
this.name = name;
this.age=age;
this.SENTOURYOKU=0;

}


    public void talk(){System.out.println(this.name+"が話す");}

}