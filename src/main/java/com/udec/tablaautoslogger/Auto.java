/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.tablaautoslogger;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author SuperUs
 */
@Named(value = "auto")
@RequestScoped
public class Auto implements Serializable{

    
    private String nombre;
    private Date modelo;
    private List<String> marca = new ArrayList<String>();
    
     @PostConstruct
    /**
     * Metodo que llena la lista marca
     */
    public void llenarMarca(){   
        marca.add("BMW");
        marca.add("Toyota");
        marca.add("Ferrari");
        marca.add("Nissan");
    }
    
    
     /**
     * Metodo que muestra un mensaje con el añño que selecciono el usuario
     * @param event variable que activa el mensaje
     */
     public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Modelo seleccionado", format.format(event.getObject())));
    }
    
    
       /**
      * Contructor de la clase Formulario
      * @param nombre variable que identifica el nombre del usuario
      * @param modelo variable que identifica el modelo del auto
      * @param marca varibale que identifica la marca del auto
      */
   public Auto(String nombre, Date modelo,List<String> marca) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
    }

    /**
     * get de la variable nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * set de la variable nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * get de la variable modelo
     * @return modelo
     */
    public Date getModelo() {
        return modelo;
    }

    /**
     * set de la variable modelo
     * @param modelo 
     */
    public void setModelo(Date modelo) {
        this.modelo = modelo;
    }

    /**
     * get de la variable marca
     * @return marca
     */
    public List<String> getMarca() {
        return marca;
    }

    /**
     * set de la variable marca
     * @param marca 
     */
    public void setMarca(List<String> marca) {
        this.marca = marca;
    }


   /**
    * Constructor de la clase Auto
    */

    public Auto() {
    }
}