/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerds;

/**
 *
 * @author CltControl
 */
public class VistaInforme {
    static VistaInforme instance;
    
    public VistaInforme(){
    }
    
    public static VistaInforme getVista(){
        if(instance==null){
            instance = new VistaInforme();
        }
        return instance;
    }
}
