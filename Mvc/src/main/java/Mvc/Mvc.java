/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mvc;

import Mvc.Controladores.Controlador;
import Mvc.Modelos.Modelo;
import Mvc.Vistas.Vista;

/**
 *
 * @author Hp
 */
public class Mvc {
       
    public static void main(String[] args){
    
     Vista Vista= new Vista();
     Vista.setVisible(true);
     Modelo Modelo= new Modelo();
     
     Controlador Controlador = new Controlador(Modelo,Vista);

}
}