package pc2.vacunacion;

public class Usuario {
    private final String name;
    private final String password;

    public Usuario(String name) {
        this.name = name;
        var stringBuffer = new StringBuilder(name);
        stringBuffer.reverse();
        this.password = stringBuffer.toString();
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void createCentro(int id){
        var centro = new Centro(id);
        VacInterface.getInstance().createCentro(centro);
    }

    public void deleteCentro(int id) {
        VacInterface.getInstance().deleteCentro(id);
    }
}
