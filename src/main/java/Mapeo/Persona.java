/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Antonio
 */
@Entity
@Table(name="persona")
public class Persona {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private int id_persona;
    
    @Column(name="nombrepersona")
    private String nombre_persona;
    
    @Column(name="nombrecarrera")
    private String nombre_carrera;
    
    @Column (name="correo")
    private String e_mail;
    
    @Column (name="contrasena")
    private String password;

    
    
     /**
     * 
     *Creamos los metodos get y set de Persona
     * 
     */
    
    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }


    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
