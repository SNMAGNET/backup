/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Capsule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


    Person Taro = new Person("YAMATARO",
    		                 23,
    		                 "m@maa.a",
    		                 "TATATA=TATA=TATA",
    		                 000-0000-0000);

    System.out.println(Taro.getName());

    Taro.setName("AAA");

    System.out.println(Taro.getName());

    Person Jiro = new Person("TANAJIRO",
                             343434,
                             "y@tbgh.yj",
                             "TbTbTb=TbTb=TbTb",
                             111-1111-1111);

    System.out.println(Taro.name);
    System.out.println(Jiro.name);

System.out.println(Jiro.getName());

Jiro.setName("BBB");

System.out.println(Jiro.getName());


/* 後からミスを探しやすくするため、
 * また、思いがけないミスを防ぐためにJiro.name = "ABABAB";のような書き方はしない  */

System.out.println(Taro.name);
System.out.println(Jiro.name);

System.out.println(Person.count);

Person.count = 45647;

System.out.println(Person.count);
	}

}
