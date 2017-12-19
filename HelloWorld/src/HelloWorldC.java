import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorldC {

	public static void main(String[] args) {

		String s="Hello";
		System.out.println(s);


		String t= new String("Hello");

		System.out.println(t);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力してください");
		String u = null;
		try {
			u = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println(u);}
}