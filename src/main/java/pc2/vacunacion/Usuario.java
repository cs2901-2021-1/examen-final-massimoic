package pc2.vacunacion;

public class Usuario {
    private final String name;
    private final String password;

    public Usuario(String name) {
        this.name = name;
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.reverse();
        this.password = stringBuilder.toString();
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void createCentro(int id){
        Centro centro = new Centro(id);
        VacInterface.getInstance().createCentro(centro);
    }

    public void deleteCentro(int id) {
        VacInterface.getInstance().deleteCentro(id);
    }
}
