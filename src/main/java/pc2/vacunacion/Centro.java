package pc2.vacunacion;

public class Centro {
    private int id;

    public Centro(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void vacunaParcial() {
        VacInterface.getInstance().addVacParcial();
    }

    public void vacunaCompleta() {
        VacInterface.getInstance().addVacCompleta();
        VacInterface.getInstance().removeVacParcial();
    }
}
