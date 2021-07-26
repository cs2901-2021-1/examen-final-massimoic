package pc2.vacunacion;

import java.util.ArrayList;
import java.util.List;

public class Login {
    private final List<Usuario> usuarios = new ArrayList();

    public void addUsuario(Usuario usuario) {this.usuarios.add(usuario);}

    public boolean login(String nombre) {
        for (Usuario usuario : usuarios) {
            if (nombre.equals(usuario.getName())) {
                StringBuilder pass = new StringBuilder(nombre);
                pass.reverse();
                if(pass.toString().equals(usuario.getPassword())) return true;
            }
        }
        return false;
    }
}
