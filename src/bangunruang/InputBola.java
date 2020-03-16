package bangunruang;
public class InputBola extends ViewDasarInput{
    
    public InputBola(String judul, BangunRuang bangunRuang) {
        super(judul, bangunRuang);
    }
    
    @Override
    public void showView() {
        super.showView();
        System.out.print("Diameter : ");
        long diameter = inputLong();
        
        bangunRuang = new Bola(diameter);
    }
}
