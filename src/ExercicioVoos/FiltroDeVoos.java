package ExercicioVoos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiltroDeVoos {
    ArrayList<Voo> listaVoos = new ArrayList<>();


    public void adicionaVoo(Voo voo) {
        listaVoos.add(voo);
    }

    public ArrayList<Voo> saindoDe(String origem){
        ArrayList<Voo> listaOrigem = new ArrayList<>();
        for(Voo i: listaVoos){
            if(i.getOrigem().equals(origem)){
                listaOrigem.add(i);
            }
        }
        return listaOrigem;
    }

    public List<Voo> porDuracao(int duracao) {

        Stream<Voo> streamVoos = listaVoos.stream();

        return streamVoos
                .filter(voo -> voo.getMinutosVoo() == duracao)
                .collect(Collectors.toList());
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
