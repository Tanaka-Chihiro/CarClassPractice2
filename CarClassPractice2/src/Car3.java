
public class Car3 {
	
	//メンバ変数
	private int no;
	private int speed;
	
	//コンストラクタ
	//noに0を設定する
	public Car3(){
		no = 0;
	}
	
	//noにnを設定する
	public Car3(int n){
		no = n;
	}
	
	//メソッド
	//変数speedに引数sを設定する
	public void run(int s) {
		speed = s;
	}
	
	//変数speedに0を設定する
	public void breake() {
		speed = 0;
	}
	
	//変数speedから引数sを減算する
	public void breake(int s) {
		speed -= s;
	}
	
	//変数no、変数speedの値を表示する
	public void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed + "です");
	}

}
