package bangunruang;

public class ViewPilihanInput extends ViewPilihan{

    public ViewPilihanInput(String judul) {
        super(judul);
    }

    @Override
    public void showView() {
        super.showView(); 
        System.out.println("1. Balok");
        System.out.println("2. Bola");
        System.out.print("Pilihan Menu Inputan : ");
        try{
            super.pilihan=inputInt();
        }
        catch (Exception e){
            System.out.println("Pilihan berupa angka (1/2)");
        }
    }
    
    
}
