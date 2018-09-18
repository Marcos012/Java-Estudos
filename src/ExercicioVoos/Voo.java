package ExercicioVoos;

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

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public int getMinutosVoo() {
        return minutosVoo;
    }

    public void setMinutosVoo(int minutosVoo) {
        this.minutosVoo = minutosVoo;
    }

    @Override
    public String toString() {
        return "Origem: " + origem + ", Destino: " + destino + ", equipamento: " + equipamento + ", Minutos: " + minutosVoo + "\n";
    }
}
