
public class HelloWorld {

	public static void main(String[] args) {
		// Hello World の出力

		System.out.println("Hello world");
		
		System.out.println("例外が");
		System.out.println("発生しました");
		System.out.println("改行は\r\nこれでもできる");
		int pra = 12;
				System.out.println(pra);
		String	name = "高橋";
		System.out.println(name);
		char chr1='A';
		System.out.println(chr1);
		
		int a = 12+34;
		System.out.println(a);
		
		String b = "12+34";
		System.out.println(b);
		
		String c = "山田";
		System.out.println(c+"さん");
		
		int a1 = 10/3;
		System.out.println(a1);		
		
		float a2 = (float) 10/3;
		System.out.println(a2);
		
		double a3 = (double) 10/3;
		System.out.println(a3);
		
		int b1 = 7 % 3;
		System.out.println(b1);
		
		int d = 46;
		System.out.println(++d);
		System.out.println(++d);
		System.out.println(++d);
		System.out.println(++d);
		
		
		int e =50;
		System.out.println(e++);
		System.out.println(e++);
		System.out.println(e++);
		System.out.println(e++);
		System.out.println(e++);
		System.out.println(e);
		System.out.println(e);
		
		int f=20;
		if(f<=30){
			System.out.println("B");
			}
		
		String g= "川田";
		if(g.equals("川田")){
			System.out.println(g+"さん");
		}
		
		
		String h="獣の相棒";
		String i = h=="獣の相棒" ? "3マナ" : "NOOOOOOOO";
		
		}
	}
