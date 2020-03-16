package bangunruang;
public class ViewDasarOutput extends ViewDasar{

    public ViewDasarOutput(String judul, BangunRuang bangunRuang) {
        super(judul, bangunRuang);
    }
    
    @Override
    public void showView(){
        super.showView();
        System.out.println(bangunRuang.getBentuk() + " : " + bangunRuang.getVolume());
    }

}
