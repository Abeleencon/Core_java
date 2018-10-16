package dayThree.ControlFlow;

public class SwitchCaseExampleOne {
	/*
	 * Switch(variable or an integer expression)
	 *
	 * 	case constant:
	 *	java code
	 	;
	 	case constant:
	 	java code
	 	;
	 	case
	 */
	public static void main(String[] args) {
		
		int num = 2;
		switch (num + 2) {
		case 1:
			System.out.println("Case 1 " + num );
			break;
		case 2:
			System.out.println("Case 2 " + num);
			break;
		case 3:
			System.out.println("Case 3: Value is: " + num);
			break;
			default:
				System.out.println("Default: Value is: " + num);
		}
	}
	
}
