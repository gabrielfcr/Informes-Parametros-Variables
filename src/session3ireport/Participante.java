/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session3ireport;

/**
 *
 * @author Gabriel
 */
public class Participante {
    private int id;
    private String nombre;
    private String username;
    private String password;
    private String comentarios;
    private int puntos;

    public Participante(int id, String nombre, String username, String password, String comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.comentarios = comentarios;
    }

    public Participante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    
    
}
