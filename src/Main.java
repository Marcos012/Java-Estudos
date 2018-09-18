import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Voo v1 = new Voo("RS", "SP", "BOING", 125);
        Voo v2 = new Voo("SC", "SP", "Chinela", 13);
        Voo v3 = new Voo("SP", "SP", "Passaro", 67);
        Voo v4 = new Voo("RJ", "SP", "747", 23);
        Voo v5 = new Voo("TR", "RS", "TAM", 98);
        Voo v6 = new Voo("RR", "AC", "GOL Bolinha", 141);

        FiltroDeVoos f = new FiltroDeVoos();

        f.listaVoos.add(v1);
        f.listaVoos.add(v2);
        f.listaVoos.add(v3);
        f.listaVoos.add(v4);
        f.listaVoos.add(v5);
        f.listaVoos.add(v6);

        //Filtro por destino
        System.out.println(f.chegandoEm("SP").toString());

        //Filtro por origem
        System.out.println(f.saindoDe("RJ").toString());

        //Filtro por Equipamento
        System.out.println(f.operadoPor("GOL Bolinha").toString());

        //Listar todos os voos
        System.out.println(f.toString());

    }
}
