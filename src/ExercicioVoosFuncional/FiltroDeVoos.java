package ExercicioVoosFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiltroDeVoos {
    ArrayList<Voo> listaVoos = new ArrayList<>();


    public void adicionaVoo(Voo voo) {
        listaVoos.add(voo);
    }

    public List<Voo> saindoDe(String origem){
        Stream<Voo> listaOrigem = listaVoos.stream();

        return listaOrigem
                .filter(voo -> voo.getOrigem().equals(origem))
                .collect(Collectors.toList());
    }

    public List<Voo> porDuracao(int duracao) {
        Stream<Voo> listaDuracao = listaVoos.stream();

        return listaDuracao
                .filter(voo -> voo.getMinutosVoo() == duracao)
                .collect(Collectors.toList());
    }

    public List<Voo> chegandoEm(String destino){
        Stream<Voo> listaDestino = listaVoos.stream();

        return listaDestino
                .filter(voo -> voo.getDestino() == destino)
                .collect(Collectors.toList());
    }

    public List<Voo> operadoPor(String equipamento){
        Stream<Voo> listaEquipamento = listaVoos.stream();

        return listaEquipamento
                .filter(voo -> voo.getEquipamento() == equipamento)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "listaVoos: " + listaVoos;
    }
}
