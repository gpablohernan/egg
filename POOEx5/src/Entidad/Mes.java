/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author hagsar
 */
public class Mes {
    
    private String [] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecretro;

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public Mes() {
    }
    
    public Mes(String mesSecretro) {
        this.mesSecretro = mesSecretro;
    }

    public String getMesSecretro() {
        return mesSecretro;
    }

    public void setMesSecretro(String mesSecretro) {
        this.mesSecretro = mesSecretro;
    }
    
    
}
