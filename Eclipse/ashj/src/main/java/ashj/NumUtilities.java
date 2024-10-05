package ashj;
public class NumUtilities {
	protected boolean isPrime(int num) {
		for(int i=2;Math.pow(i, 2)<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	protected boolean isArmstrong(int num) {
		int temp = 0;
		int temp2 = num;
		while(num!=0) {
			int rem = num%10;
			temp += (int) Math.pow(rem, 3);
			num /= 10;
		}
		return temp==temp2;
		
	}
	protected int factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	protected int factorial(int num,boolean recursive) {
		if (num<=1) {
			return num;
		}
		return num*factorial(num-1);
		
	}
}
