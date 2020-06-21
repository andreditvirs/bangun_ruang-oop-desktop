import java.util.Scanner;
public class ViewBaseInput extends ViewBase{

	ViewBaseInput(String title){
		super(title);
	}

	public int inputInt(String message){
		Scanner scanResult = new Scanner(System.in);		
		System.out.print(message+" : ");
		int result = scanResult.nextInt();
		return result;
	}
}