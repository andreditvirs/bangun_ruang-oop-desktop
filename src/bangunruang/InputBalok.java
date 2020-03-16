package bangunruang;
public class InputBalok extends ViewDasarInput{
    
    public InputBalok(String judul, BangunRuang bangunRuang) {
        super(judul, bangunRuang);
    }
    
    @Override
    public void showView() {
        super.showView();
        System.out.print("Panjang : ");
        long panjang = inputLong();
        System.out.print("Lebar : ");
        long lebar = inputLong();
        System.out.print("Tinggi : ");
        long tinggi = inputLong();
        
        bangunRuang = new Balok(panjang, lebar, tinggi);
    }
}
