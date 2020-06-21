public class Kubus extends BangunRuang{

    public Kubus(float rusuk){
        super(rusuk, rusuk, rusuk);
	setBentuk("Kubus");
    }
    public void calculateVolume(){
        setVolume(getPanjang() * getLebar() * getTinggi());
    }
    
    public String toString(){
	return super.toString()
		+"{"
		+ "rusuk:" + this.getPanjang()
		+ ",volume:" + this.getVolume()
		+"}";
    }
}