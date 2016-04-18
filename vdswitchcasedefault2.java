package BaiTap1;

public class vdswitchcasedefault2 {

	public static void main(String[] args) {
		int age =30;
		switch(age){
		case 18:
			System.out.println("Ban 18 tuoi");break;
		case 20:case 30: case 40:
			System.out.println("Ban " + age);break;
			default: 
				System.out.println("Tuoi khac");
		}

	}

}
