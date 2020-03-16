package bangunruang;
public class ViewDasar {
    public BangunRuang bangunRuang;
    public String judul;

    public ViewDasar(String judul) {
        this.judul = judul;
    }

    public ViewDasar(String judul, BangunRuang bangunRuang) {
        this.bangunRuang = bangunRuang;
        this.judul = judul;
    }
    
    public void showView(){
        System.out.println(judul);
    }
    
    public BangunRuang getBangunRuang(){
        return bangunRuang;
    }    
    
}
