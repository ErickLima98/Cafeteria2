/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad;

/**
 *
 * @author Erick
 */
public class Usuario {
    private int nivelAcceso, userId;    //almacena el codigo de nivel de acceso
    private String Username, tipoUser;  //almacena el nombre y tipo de usuario
    
    public Usuario(int nivelAcceso, int userId, String Usarname, String tipoUser){
        this.nivelAcceso = nivelAcceso;
        this.userId = userId;
        this.Username = Usarname;
        this.tipoUser = tipoUser;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return Username;
    }

    public String getTipoUser() {
        return tipoUser;
    } 
}
