package Esercizio2;

import java.util.List;

import static Esercizio2.Main.*;

public class Esercizio2 {


        public static void main(String[] args) {
            int N = 5;
            List<Integer> listaCasuale = funzioneListaCasuale(N);

            System.out.println("Lista casuale:");
            System.out.println(listaCasuale);

            List<Integer> listaInvertita = listaInvertita(listaCasuale);

            System.out.println("Lista invertita:");
            System.out.println(listaInvertita);

            System.out.println("Elementi in posizioni dispari:");
            stampaPosizioni(listaCasuale, false);

            System.out.println("Elementi in posizioni pari:");
            stampaPosizioni(listaCasuale, true);
        }
    }


