package easy;

public class ExcelColumnNumber {

	public static void main(String[] args) {
		System.out.println(ExcelColumnNumber.titleToNumber("AB"));
	}
	
	public static int titleToNumber(String s) {
        int value = 0;
        for(int i=0;i<s.length();i++){
            value = value * 26 + ((int)s.charAt(i) - 'A') + 1;
        }
        return value;
    }
}
