package test;

public class Test {
	
	// extract Digit from given number
	
	public static int countDigits(int n){
        int count =0;
        int lastDigit = 0;
        while(n >0){
            lastDigit = n%10;
            n = n/10;
            count++;
        }

        return count;
    }

	public static void main(String[] args) {
		int result = countDigits(35);
			System.out.println(result);
	}
}
