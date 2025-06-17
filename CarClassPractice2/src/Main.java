
public class Main {

	public static void main(String[] args) {
		//問1
		System.out.println("【問1】");
		Car1 c1 = new Car1();
		c1.setNo(2525);
		c1.run(30);
		c1.display();
		
		c1.breake(10);
		c1.display();
		System.out.println();
		
		//問2
		System.out.println("【問2】");
		Car2 c2_1 = new Car2();
		c2_1.run(30);
		c2_1.display();
		
		Car2 c2_2 = new Car2(2525);
		c2_2.run(50);
		c2_2.display();
		System.out.println();
		
		//問3
		System.out.println("【問3】");
		Car3 c3_1 = new Car3();
		c3_1.run(30);
		c3_1.display();
		
		Car3 c3_2 = new Car3(2525);
		c3_2.run(50);
		c3_2.display();
		System.out.println();
		
		//問4
		System.out.println("【問4】");
		Car4 c4_1 = new Car4();
		Car4.display();
		
		Car4 c4_2 = new Car4(2525);
		Car4.display();
		
		Car4 c4_3 = new Car4(8888);
		Car4.display();

	}

}
