
public class Test {

	public static void main(String[] args) {

		Person taro = new Person();

		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "0000000000";
		taro.address = "aaaaaaaaa";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		Person kazunari = new Person();
		
		kazunari.name = "米田和成";
		kazunari.age = 23;
		kazunari.phoneNumber = "1111111111";
		kazunari.address = "bbbbbbbbb";
		
		System.out.println(kazunari.name);
		System.out.println(kazunari.age);
		System.out.println(kazunari.phoneNumber);
		System.out.println(kazunari.address);
		
		Person jiro = new Person();
		
		 jiro.name = "木村次郎";
		 jiro.age = 18;
		 
		 System.out.println(jiro.name);
		 System.out.println(jiro.age);
		 
		Person hanako = new Person();
		
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "5555555555";
		hanako.address = "ddddddddd";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

	}

	
}

