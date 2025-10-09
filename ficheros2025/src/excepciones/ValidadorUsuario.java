package excepciones;

import vista.Escaner;

public class ValidadorUsuario {

    public String validar() {
        String usuario;
        usuario= Escaner.pedirUsuario("Ingrese usuario");


        if (usuario == null || usuario.isEmpty()) {
            return "El nombre de usuario no puede estar vacío.";
        }

        if (!usuario.matches("[a-zA-Z0-9_]+")) {
            return "El nombre de usuario solo puede contener letras, números y guiones bajos.";
        }

        return usuario;

    }
}

