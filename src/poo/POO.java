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
        
      //  double a=3, b=2;
        
      //   System.out.println("Resultado: "+Calculo.elevar(a,b));
        
        
        
        
        Carro meuCarro = new Carro();
        
        
        meuCarro.setCor("preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("J-2304");
        meuCarro.setTipo("Gol");
        
        meuCarro.imprimeDadosCarro();
        
        
        Pessoa dona = new Pessoa();
        
        dona.setNome("Mateus");
        dona.setCorCabelo("Loiro");
        dona.setBiotipo("Magro");
        dona.setIdade(23);
        
        dona.imprimeDadosPessoa();
       
        
        Barco meuBarco = new Barco();
        
        meuBarco.setCor("Preto e Branco");
        meuBarco.setTipo("Navio");
        meuBarco.setNome("Navio Militar");
        meuBarco.setObjetos(5);
        
        meuBarco.imprimeDadosBarco();
                
    }
    
}
