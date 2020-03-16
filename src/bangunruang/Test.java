package bangunruang;

import java.util.*;
public class Test {

    public static void main(String[] args) {
        ArrayList<BangunRuang> list = new ArrayList<>();
        
        while(true){
            ViewPilihanMenu pilihanMenu = new ViewPilihanMenu("Menu :");
            pilihanMenu.showView();
            if (pilihanMenu.pilihan==1){
                ViewPilihanInput pilihanInput = new ViewPilihanInput("Menu Inputan :");
                pilihanInput.showView();
                if (pilihanInput.pilihan==1){
                    BangunRuang balok = new Balok();
                    InputBalok inputBalok = new InputBalok("Input Data Balok", balok);
                    inputBalok.showView();
                    list.add(inputBalok.getBangunRuang());
                }
                else if (pilihanInput.pilihan==2){
                    BangunRuang bola = new Bola();
                    InputBola inputBola = new InputBola("Input Data Balok", bola);
                    inputBola.showView();
                    list.add(inputBola.getBangunRuang());
                }
                else{
                    System.out.println("Pilihan Menu Inputan Salah");
                }
            }
            else if (pilihanMenu.pilihan==2){
                ViewPilihanOutput pilihanOutput = new ViewPilihanOutput("Masukkan indeks :");
                pilihanOutput.showView();
                BangunRuang bangunruang = null;
                try{
                    bangunruang = list.get(pilihanOutput.pilihan);
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("Indeks salah");
                }
                if (bangunruang instanceof Balok){
                    BangunRuang balok = list.get(pilihanOutput.pilihan);
                    ViewDasarOutput viewOutput = new ViewDasarOutput("Hasil Perhitungan Volume", balok);
                    viewOutput.showView();
                }
                else if (bangunruang instanceof Bola){
                    BangunRuang bola = list.get(pilihanOutput.pilihan);
                    ViewDasarOutput viewOutput = new ViewDasarOutput("Hasil Perhitungan Volume", bola);
                    viewOutput.showView();
                }
            }
            else if (pilihanMenu.pilihan==3)
                break;
            else{
                System.out.println("Pilihan Menu Salah");
            }
        }
    }
}
