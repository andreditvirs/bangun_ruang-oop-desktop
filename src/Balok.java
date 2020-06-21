public class Balok extends BangunRuang{

    public Balok(float panjang, float lebar, float tinggi){
        super(panjang, lebar, tinggi);
	setBentuk("Balok");
    }
    public void calculateVolume(){
        setVolume(getPanjang() * getLebar() * getTinggi());
    }

    public String toString(){
	return super.toString()
		+"{"
		+ "panjang:" + this.getPanjang()
		+ ",lebar:" + this.getLebar()
		+ ",tinggi:" + this.getTinggi()
		+ ",volume:" + this.getVolume()
		+"}";
    }
    
}