
//問4：クラス変数・クラスメソッドの実装
public class Car4 {
	
	//メンバ変数
	private int no;
	private static int count = 0;
	
	//コンストラクタ
	//noに0を設定する
	public Car4(){
		no = 0;
		count++;
		System.out.println("ナンバーなしを作りました");
	}
	
	//noにnを設定する
	public Car4(int n){
		no = n;
		count++;
		System.out.println("ナンバーなし" + no + "を作りました");
	}
	
	//メソッド
	//作成した台数の表示
	public static void display() {
		System.out.println( count + "台作成済みです");
	}

}
