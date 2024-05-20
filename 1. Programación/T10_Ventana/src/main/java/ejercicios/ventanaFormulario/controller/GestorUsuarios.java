package ejercicios.ventanaFormulario.controller;

import lombok.Getter;
import lombok.Setter;
import ejercicios.ventanaFormulario.model.Usuario;

import java.util.ArrayList;

@Getter
@Setter
public class GestorUsuarios {
    private ArrayList<Usuario> listaUsuarios;

    public GestorUsuarios() {
        listaUsuarios = new ArrayList();
    }

    public void agregarUsuario(Usuario usuario){
            listaUsuarios.add(usuario);

    }

    public void listarUsuarios(){
        for (Usuario item : listaUsuarios) {
            System.out.println(item);
        }
        System.out.println("La cantidad de usuarios es de: " + listaUsuarios.size());
    }

    public Usuario sacarUsuario(String correo){
        for (Usuario item : listaUsuarios) {
            if (correo.equals(item.getCorreo())){
                return item;
            }
        }

        return null;
    }

}

