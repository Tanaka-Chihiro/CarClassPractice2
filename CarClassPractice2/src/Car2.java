
public class Car2 {
	
	//メンバ変数
	int no;
	int speed;
	
	//コンストラクタ
	//noに0を設定する
	Car2(){
		no = 0;
	}
	
	//noにnを設定する
	Car2(int n){
		no = n;
	}
	
	//メソッド
	//変数speedに引数sを設定する
	void run(int s) {
		speed = s;
	}
	
	//変数speedに0を設定する
	void breake() {
		speed = 0;
	}
	
	//変数speedから引数sを減算する
	void breake(int s) {
		speed -= s;
	}
	
	//変数no、変数speedの値を表示する
	void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed + "です");
	}

}
