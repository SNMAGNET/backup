/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person Taro = new Person("YAMATARO",23,530000);

		System.out.println(Taro.name);
		System.out.println(Taro.age);
		System.out.println(Taro.SENTOURYOKU);



		Person Jiro = new Person("YAMAJIRO",45);

		System.out.println(Jiro.name);
		System.out.println(Jiro.age);
		System.out.println(Jiro.SENTOURYOKU);

		Person Miro = new Person(50,"YAMAMIRO");

		System.out.println(Miro.name);
		System.out.println(Miro.age);
		System.out.println(Miro.SENTOURYOKU);

	}

}
