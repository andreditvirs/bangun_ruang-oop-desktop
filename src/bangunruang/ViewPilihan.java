package bangunruang;

import java.util.Scanner;
public class ViewPilihan extends ViewDasar implements ScannerInput{
    public int pilihan;
    
    public ViewPilihan(String judul) {
        super(judul);
    }

    @Override
    public String inputString() {
        Scanner scanResult = new Scanner(System.in);
        String result = scanResult.nextLine();
        return result;
    }

    @Override
    public long inputLong() {
        Scanner scanResult = new Scanner(System.in);
        long result = scanResult.nextLong();
        return result;  
    }
    
    public int inputInt() {
        Scanner scanResult = new Scanner(System.in);
        int result = scanResult.nextInt();
        return result;  
    }
}
