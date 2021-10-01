/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mvc.Controladores;

import Mvc.Modelos.Modelo;
import Mvc.Vistas.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hp
 */
public class Controlador implements ActionListener{
    
    private Vista Vista= new Vista();
    private Modelo Modelo= new Modelo();

    public Controlador() {
    }
    
    public Controlador(Modelo Modelo ,Vista Vista){
        this.Modelo=Modelo;
        this.Vista=Vista;
        Vista.boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        Modelo.setNumero1(Integer.parseInt(Vista.caja1.getText()));
        Modelo.setNumero2(Integer.parseInt(Vista.caja2.getText()));
       
        Modelo.sumar();
        Vista.cajaResultado.setText(String.valueOf(Modelo.sumar()));
    }
    
    
    
}
