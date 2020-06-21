public class ViewBase{
	private String title;
	ViewBase(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}

	public void showTitle(){
		System.out.println("");
		System.out.println(this.title);
	}
}