/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romanos.pruebas;

import com.mycompany.kataromanos.Conversor;
import org.testng.annotations.Test;

/**
 *
 * @author aulaf209
 */
public class PruebasConversor {
    
    @Test
     public void ElNumeroNoSeaNegativoOcero() throws UnsupportedOperationException{
         Conversor a = new Conversor(1);
     }
     
     @Test
     public void EsUnNumeroBasicoRomano() throws UnsupportedOperationException{
         Conversor a = new Conversor(5);
         a.ValidarNumerosBasicosRomanos();
     }
     
     @Test
     public void CuantasCifrasTieneElNumero(){
         Conversor a = new Conversor(40);
         a.CantidadCifras();
     }
     
     @Test
     public void EsCuatroOnueve(){
         Conversor a = new Conversor(4);
         a.Validar4o9();
     }
     
     @Test
     public void ElNumeroNoSeaDecimal(){
         Conversor a = new Conversor(5.5);
         a.ValidarNumeroEntero();
     }
     
   
     
     @Test
     public void toDoNoTieneLetras(){
     Conversor a = new Conversor():
     if(a.esLetra=false){
         System.out.print ("el numero ingresado tiene letras");
     }
     
     public void toDoEsNumero(){
     Conversor a = new Conversor():
     if(a.esLetra=true){
         System.out.print ("el numero ingresado es valido");
     }   
     }
     
     
}
