package Model;

import View.InternaJoguinoVetor;
import java.util.Random;
import javax.swing.JOptionPane;

public class GerarVetor {

//    public int[] GerarVetor(int tam, int limite){
//        int vetor[] = new int[tam];
//        Random gerador = new Random();
//        
//        for(int i = 0; i < tam; i++){
//        vetor[i] = gerador.nextInt(limite+1);
//        
//    }
//        return vetor;
//    }
    public int[] GerarVetor(int tam, int limite) {

        int[] v = new int[tam];
        Random gerador = new Random();
        boolean b = false;

        for (int i = 0; i < v.length;) {
            if (i == 0) {
                v[i] = gerador.nextInt(limite) + 1;
                i++;
            } else {
                v[i] = gerador.nextInt(limite) + 1;
                b = false;
                for (int j = 0; j < i; j++) {
                    if (v[i] == v[j]) {
                        b = false;
                        break;
                    } else {
                        b = true;
                    }
                }
                if (b) {
                    i++;
                }
            }
        }
       return v;

//        for (int i = 0; i < v.length; i++) {
//            int iMontado;
//            iMontado = v[i];
//        }
//        return null;
    }

    public void ImprimeVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " | ");
        }
    }
}
