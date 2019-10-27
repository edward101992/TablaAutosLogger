/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.logica;

import com.udec.tablaautoslogger.Auto;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author SuperUs
 */
@Named(value = "principal")
@ApplicationScoped
public class Principal {

    private Auto auto = new Auto();
    private static List<Auto> listaAuto = new ArrayList();
    public Principal() {
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public List<Auto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(List<Auto> listaAuto) {
        Principal.listaAuto = listaAuto;
    }
    
    public void agregarAuto(){  
        Principal.listaAuto.add(this.auto);
    }
    
    
    public void editarAuto(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Auto editado", ((Auto) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void eliminarAuto(Auto auto){
        Principal.listaAuto.remove(auto);
    }
}
