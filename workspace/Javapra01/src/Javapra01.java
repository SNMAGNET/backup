
public class Javapra01 {

	public static void main(String[] args) {

		System.out.println("堂々");



		//if文


		int a= 7;
		if(3<a && a<10){
			System.out.println("A");
		}

		int b= 5;
		if(5<=b || b<=0){
			System.out.println("B");
		}

		int c= 5;
		if(8<c){
			System.out.println("A");
		}
		else if(c<10){
			System.out.println("B");
		}

		int d=7;
		if(d>3 && d<10){
			System.out.println("A");
		}

		int e=7;
		if(e>3){
			if(e<10){


			System.out.println("A");
		            }
			   }


		int a1=254;
		if(a1==2){
			System.out.println("A1");
		}
		else if(a1==3){
			System.out.println("B");
		}
		else{
			System.out.println("C");

		}

		int a2=23;
		switch(a2){
		case 23:
			System.out.println("A2");
		break;
		}

		int a3=50;
		switch(a3){
		case 0:
			System.out.println("a3");
			break;
		case 1:
			System.out.println("a4");
			break;
		default :
			System.out.println("該当しません");
		}


		//配列


		String[]name = new String[3];

		name[0]="田中";
		name[1]="高橋";
		name[2]="斉藤";

		System.out.println(name[0]);

		String[]name1 = {"yamada,kamio,itijou"};
		System.out.println(name1);


		String[][] country ={
				{"Japan","Tai"},
				{"UK","US"},
				{"ASIA","North"}
		};

		System.out.println(country[0][1]);


        String[][]country01 = new String[3][2];

		country01[0][0]="日本";
		country01[0][1]="タイ";
		country01[1][0]="アメリカ";
		country01[1][1]="ブラジル";
		country01[2][0]="フランス";
		country01[2][1]="ロシア";

		System.out.println(country01[2][1]);



		for(int i=0; i<5; i++){
			System.out.println("TAR");
		}

		String j="獣の相棒";
		String k = j=="獣の相棒" ? "3マナ":"NOOOOOO";
        System.out.println(k);

        int L =1;
        while(L<=5){
        	System.out.println(L);
        	L++;
        }

        int m =1;
        do{
        	System.out.println(m);
        	m--;
        }while(m>1);

	}

}
