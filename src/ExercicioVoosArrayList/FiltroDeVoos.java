package ExercicioVoosArrayList;

import java.util.ArrayList;
import java.util.List;

public class FiltroDeVoos {

    List<Voo> listaVoos = new ArrayList<>();

    public void adicionaVoo(Voo voo) {
        listaVoos.add(voo);
    }

    public List<Voo> saindoDe(String origem){
        List<Voo> listaOrigem = new ArrayList<>();

        for(Voo i: listaVoos){
            if(i.getOrigem().equals(origem)){
                listaOrigem.add(i);
            }
        }
        return listaOrigem;
    }

    public List<Voo> chegandoEm(String destino){
        List<Voo> listaDestino = new ArrayList<>();

        for(Voo i: listaVoos){
            if(i.getDestino().equals(destino)){
                listaDestino.add(i);
            }
        }
        return listaDestino;
    }

    public List<Voo> operadoPor(String equipamento){
        List<Voo> equipamentoLista = new ArrayList<>();

        for(Voo i: listaVoos){
            if(i.getEquipamento().equals(equipamento)){
                equipamentoLista.add(i);
            }
        }
        return equipamentoLista;
    }

    public List<Voo> porDuracao(int duracao){
        List<Voo> listaDuracao = new ArrayList<>();

        for(Voo i: listaVoos){
            if(i.getMinutosVoo() == duracao){
                listaDuracao.add(i);
            }
        }
        return listaDuracao;
    }

    @Override
    public String toString() {
        return "listaVoos: " + listaVoos;
    }


}
