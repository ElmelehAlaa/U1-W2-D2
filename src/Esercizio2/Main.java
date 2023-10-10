package Esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main
{public static List<Integer> funzioneListaCasuale (int N){
    List<Integer> listaCasuale = new ArrayList<>();
    Random random = new Random();
    for (int i =0; i<N; i++){
        listaCasuale.add(random.nextInt(100));
    }
    return listaCasuale;

}
public static List<Integer> listaInvertita(List<Integer> lista){
    List<Integer> listaInvertita = new ArrayList<>(lista);

    for (int i = lista.size()-1 ; i>=0;i-- ){
        listaInvertita.add(lista.get(i));

    }
    return listaInvertita;
}

public static void stampaPosizioni(List<Integer> lista, boolean bool){
    for(int i=0; i< lista.size(); i++){
        if(!bool && i %2==0 ) {
            System.out.println(lista.get(i));
        } else if ( bool && i%2 !=0){
            System.out.println(lista.get(i));

        }
    }
}
}
