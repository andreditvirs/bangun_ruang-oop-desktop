package bangunruang;

public class ViewPilihanMenu extends ViewPilihan{

    public ViewPilihanMenu(String judul) {
        super(judul);
    }

    @Override
    public void showView() {
        super.showView(); 
        System.out.println("1. Input BangunRuang");
        System.out.println("2. Hitung Volume");
        System.out.println("3. Selesai");
        System.out.print("Pilihan Menu :");
        try{
            super.pilihan=inputInt();
        }
        catch (Exception e){
            System.out.println("Pilihan berupa angka (1/2/3)");
        }
    }
}
