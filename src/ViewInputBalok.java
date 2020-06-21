public class ViewInputBalok extends ViewBaseInput{

	ViewInputBalok(String title){
		super(title);
	}

	public Balok showView(){
		showTitle();
		int panjang = inputInt("Input panjang");
		int lebar = inputInt("Input lebar");
		int tinggi = inputInt("Input tinggi");
		return new Balok(panjang, lebar, tinggi);

	}
}