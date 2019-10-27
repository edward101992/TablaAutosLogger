/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.logica;

import com.udec.tablaautoslogger.Auto;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author SuperUs
 */
@Named(value = "principal")
@RequestScoped
public class Principal {

    private Auto auto = new Auto();
    private List<Auto> listaAuto = new ArrayList();
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
        this.listaAuto = listaAuto;
    }
    
    public void agregarAuto(){
    
        this.listaAuto.add(this.auto);
    }
    
    
}
