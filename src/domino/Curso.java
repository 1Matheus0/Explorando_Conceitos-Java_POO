package domino;

public class Curso extends Conteudo {

    private int cargoHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargoHoraria;
    }

    public Curso() {
    }

    public int getCargoHoraria() {
        return cargoHoraria;
    }

    public void setCargoHoraria(int cargoHoraria) {
        this.cargoHoraria = cargoHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "ttitulo= " + getTitulo()+ '\''+
                ", descricao= "+ getDescricao()+ '\''+
                ", cargoHoraria= " + cargoHoraria +
                '}';
    }
}
