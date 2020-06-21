public class ViewBaseOutput extends ViewBase{

	ViewBaseOutput(String title){
		super(title);
	}

	public void showData(BangunRuang bangunRuang){
		showTitle();
		System.out.println(bangunRuang.toString());
	}
}