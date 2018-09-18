package ExercicioVoos;

import java.util.ArrayList;

public class FiltroDeVoos {
    ArrayList<Voo> listaVoos = new ArrayList<>();

    public ArrayList<Voo> saindoDe(String origem){
        ArrayList<Voo> listaOrigem = new ArrayList<>();
        for(Voo i: listaVoos){
            if(i.getOrigem().equals(origem)){
                listaOrigem.add(i);
            }
        }
        return listaOrigem;
    }

    public ArrayList<Voo> chegandoEm(String destino){
        ArrayList<Voo> listaDestino = new ArrayList<>();
        for(Voo i: listaVoos){
            if(i.getDestino().equals(destino)){
                listaDestino.add(i);
            }
        }
        return listaDestino;
    }

    public ArrayList<Voo> operadoPor(String equipamento){
        ArrayList<Voo> equipamentoLista = new ArrayList<>();
        for(Voo i: listaVoos){
            if(i.getEquipamento().equals(equipamento)){
                equipamentoLista.add(i);
            }
        }
        return equipamentoLista;
    }

    @Override
    public String toString() {
        return "listaVoos: " + listaVoos;
    }
}
