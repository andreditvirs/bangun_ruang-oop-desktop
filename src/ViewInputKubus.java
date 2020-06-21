public class ViewInputKubus extends ViewBaseInput{
	ViewInputKubus(String title){
		super(title);
	}

	public Kubus showView(){
		showTitle();
		int rusuk = inputInt("Input rusuk");
		return new Kubus(rusuk);
	}
}