package ashj;

public class MathInJava {
	public static void main(String[] args) {
//		PRIME NUMBER
		NumUtilities nutil = new NumUtilities();
//		System.out.print(nutil.isPrime(29));
		
//		ARMSTRONG NUMBER
		System.out.println(nutil.isArmstrong(153));
		System.out.println(nutil.isArmstrong(196));
		
//		FACTORIAL
		System.out.println(nutil.factorial(5));
		System.out.println(nutil.factorial(5,true));
		
	}
}
