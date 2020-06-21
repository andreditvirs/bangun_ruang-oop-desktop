public class TestBangunRuang{
    public static void main(String args[]){
	Balok balok; Kubus kubus; Limas limas;

	ViewInputBalok vib = new ViewInputBalok("Form Input Balok");
	balok = vib.showView();

	ViewInputKubus vik = new ViewInputKubus("Form Input Kubus");
	kubus = vik.showView();
	ViewInputLimas vil = new ViewInputLimas("Form Input Limas");
	limas = vil.showView();


	new ViewBaseOutput("Form Output Balok").showData(balok);
	new ViewBaseOutput("Form Output Kubus").showData(kubus);
	new ViewBaseOutput("Form Output Limas").showData(limas);
    }
}


/*
	Balok balok; Kubus kubus; Limas limas;
	ViewInputBalok vib = new ViewInputBalok("Form Input Balok");
	balok = vib.showView();
	ViewInputKubus vik = new ViewInputKubus("Form Input Kubus");
	kubus = vik.showView();
	ViewInputLimas vil = new ViewInputLimas("Form Input Limas");
	limas = vil.showView();


	new ViewBaseOutput("Form Output Balok").showData(balok);
	new ViewBaseOutput("Form Output Kubus").showData(kubus);
	new ViewBaseOutput("Form Output Limas").showData(limas);
*/



/*
ViewBaseInput vbi = new ViewBaseInput("Form Input Jumlah BangunRuang");
	int jumlahBalok = vbi.inputInt("Inputkan jumlah balok");
	int jumlahKubus = vbi.inputInt("Inputkan jumlah balok");
	int jumlahLimas = vbi.inputInt("Inputkan jumlah balok");

	for(int i=0; i<jumlahBalok; i++){
		Balok balok;
		ViewInputBalok vib = new ViewInputBalok("Form Input Balok");
		balok = vib.showView();
		new ViewBaseOutput("Form Output Balok").showData(balok);
	}
	for(int i=0; i<jumlahKubus; i++){
		Kubus kubus;
		ViewInputKubus vik = new ViewInputKubus("Form Input Kubus");
		kubus = vik.showView();
		new ViewBaseOutput("Form Output Kubus").showData(kubus);
	}
	for(int i=0; i<jumlahBalok; i++){
		Limas limas;
		ViewInputLimas vil = new ViewInputLimas("Form Input Limas");
		limas = vil.showView();
		new ViewBaseOutput("Form Output Limas").showData(limas);
	}
*/