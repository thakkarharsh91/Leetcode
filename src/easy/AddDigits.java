package easy;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(AddDigits.addDigits(38));
	}
	
	public static int addDigits(int num) {
        int sum = 0;
        while(num > 0){
            sum += num%10;
            sum = sum%10 + sum/10;
            num = num/10;
        }
        return sum;
    }
}
