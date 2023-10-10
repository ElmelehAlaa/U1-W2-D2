package es3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> rubrica;

    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }



    public void cancellaContatto(String nome) {
        rubrica.remove(nome);
    }

    public String cercaNumero(String nome) {
        return rubrica.get(nome);
    }}


