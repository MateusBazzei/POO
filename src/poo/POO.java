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
public class POO {
    
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        
        meuCarro.setCor("preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("J-2304");
        meuCarro.setTipo("Gol");
        
        System.out.println("-------CARRO-------");
        System.out.println("Cor: "+meuCarro.getCor());
        System.out.println("Número de portas: "+meuCarro.getNumPortas());
        System.out.println("Tipo: "+meuCarro.getTipo());
        System.out.println("Placa: "+meuCarro.getPlaca());
        
        
        Pessoa dona = new Pessoa();
        
        dona.setNome("Mateus");
        dona.setCorCabelo("Loiro");
        dona.setBiotipo("Magro");
        dona.setIdade(23);
        
        System.out.println("-------PESSOA-------");
        System.out.println("Nome: "+dona.getNome());
        System.out.println("Cor do cabelo: "+dona.getCorCabelo());
        System.out.println("Biotipo: "+dona.getBiotipo());
        System.out.println("Idade: "+dona.getIdade());
        
        Barco meuBarco = new Barco();
        
        meuBarco.setCor("Preto e Branco");
        meuBarco.setTipo("Navio");
        meuBarco.setNome("Navio Militar");
        meuBarco.setObjetos(5);
        
        System.out.println("-------BARCO-------");
        System.out.println("Nome do barco: "+meuBarco.getNome());
        System.out.println("Tipo: "+meuBarco.getTipo());
        System.out.println("Cor: "+meuBarco.getCor());
        System.out.println("Número de objetos: "+meuBarco.getObjetos());
                
    }
    
}
