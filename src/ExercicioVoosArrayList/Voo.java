package ExercicioVoosArrayList;

public class Voo {

    private String origem;
    private String destino;
    private String equipamento;
    private int minutosVoo;

    public Voo(String origem, String destino, String equipamento, int minutosVoo) {
        this.origem = origem;
        this.destino = destino;
        this.equipamento = equipamento;
        this.minutosVoo = minutosVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public int getMinutosVoo() {
        return minutosVoo;
    }

    @Override
    public String toString() {
        return "Origem: " + origem + ", Destino: " + destino + ", equipamento: " + equipamento + ", Minutos: " + minutosVoo + "\n";
    }


}
