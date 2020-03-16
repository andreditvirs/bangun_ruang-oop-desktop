package bangunruang;

public class ViewPilihanOutput extends ViewPilihan{

    public ViewPilihanOutput(String judul) {
        super(judul);
    }

    @Override
    public void showView() {
        super.showView();
        try{
            super.pilihan=inputInt();
        }
        catch (Exception e){
            System.out.println("Indeks berupa angka");
        }
    }
}
