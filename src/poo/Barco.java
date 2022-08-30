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
public class Barco {
        String tipo;
        String cor;
        String nome;
        int objetos;
    
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
        
        
        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        
        
        public int getObjetos(){
            return objetos;
        }
        public void setObjetos(int objetos){
            this.objetos = objetos;
        }
               
}
