/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author mateus.bazzei
 */
public class Carro {
        String tipo;
        String cor;
        String placa;
        int numPortas;
        
        void imprimeDadosCarro(){
            
            System.out.println("-------CARRO-------");
            System.out.println("Cor: "+ cor);
            System.out.println("Número de portas: "+ numPortas);
            System.out.println("Tipo: "+ tipo);
            System.out.println("Placa: "+ placa);
        }
        
        
        
        public String getTipo(){
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
        
        
        public String getCor(){
            return cor;
        }
        public void setCor(String cor){
            this.cor = cor;
        }
        
        
         public String getPlaca(){
            return placa;
        }
        public void setPlaca(String placa){
            this.placa = placa;
        }
        
        
        public int getNumPortas(){
            return numPortas;    
        }
        public void setNumPortas(int numPortas){
            this.numPortas = numPortas;
        }
        
}
