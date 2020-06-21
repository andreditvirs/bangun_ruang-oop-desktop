public class ViewInputLimas extends ViewBaseInput{

	ViewInputLimas(String title){
		super(title);
	}

	public Limas showView(){
		showTitle();
		int panjang = inputInt("Input panjang");
		int lebar = inputInt("Input lebar");
		int tinggi = inputInt("Input tinggi");
		return new Limas(panjang, lebar, tinggi);

	}
}