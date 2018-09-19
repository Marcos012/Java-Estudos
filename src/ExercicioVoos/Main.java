package ExercicioVoos;

import ExercicioVoos.FiltroDeVoos;

public class Main {

    public static void main(String[] args) {

        Voo v1 = new Voo("RS", "SP", "BOING", 125);
        Voo v2 = new Voo("SC", "SP", "Chinela", 13);
        Voo v3 = new Voo("SP", "SP", "Passaro", 67);
        Voo v4 = new Voo("RJ", "SP", "747", 23);
        Voo v5 = new Voo("TR", "RS", "TAM", 98);
        Voo v6 = new Voo("RR", "AC", "GOL Bolinha", 141);

        FiltroDeVoos f = new FiltroDeVoos();

        f.adicionaVoo(v1);
        f.adicionaVoo(v2);
        f.adicionaVoo(v3);
        f.adicionaVoo(v4);
        f.adicionaVoo(v5);
        f.adicionaVoo(v6);

//        System.out.println(f.chegandoEm("SP").toString());
//
//        System.out.println(f.saindoDe("RJ").toString());
//
//        System.out.println(f.operadoPor("GOL Bolinha").toString());
//
//        System.out.println(f.toString());

//        System.out.println(f.porDuracao(98));

    }
}
