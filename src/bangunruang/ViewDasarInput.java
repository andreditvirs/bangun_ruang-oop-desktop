package bangunruang;
import java.util.Scanner;
public class ViewDasarInput extends ViewDasar implements ScannerInput{
    
    public ViewDasarInput(String judul, BangunRuang bangunRuang) {
        super(judul, bangunRuang);
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
        Long result = scanResult.nextLong();
        return result;        
    }
}
