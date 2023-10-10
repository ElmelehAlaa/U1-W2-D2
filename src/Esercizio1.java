import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci il numero di parole da inserire ");
        int N= input.nextInt();
        input.nextLine();
        Set<String> paroleDiverse = new HashSet<>();
        Set<String> paroleUguali = new HashSet<>();

        for (int i =0; i<N; i++){
            System.out.println("inserisci la parola");
            String parola= input.nextLine();

            if(!paroleDiverse.add(parola)){
                paroleDiverse.add(parola);
            }
        }
        for(String parola: paroleUguali){
            System.out.println(parola);
        }

        int nParoleDiverse = paroleDiverse.size();
        System.out.println("numero parole diverse:"+ nParoleDiverse);
        System.out.println("elenco");
        for (String parola:paroleDiverse){
            System.out.println(parola);
        }
        input.close();
    }
}