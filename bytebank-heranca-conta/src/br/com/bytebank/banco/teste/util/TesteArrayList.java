package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

    public static void main(String[] args) {

        List<Conta> lista = new LinkedList<Conta>(); //ArrayList<Conta> lista = new ArrayList<Conta>();
        
       // ArrayList<String> nomes = new ArrayList<String>();
        
        // List<Conta> lista = new Vector<Conta>(); //usa array por baixo, mas tbm é threadsafe
        //Collection<Conta> lista = new Vector<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());
//        Conta ref = (Conta) lista.get(0);
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());
        
//        Conta ref = (Conta) lista.get(0);
//        System.out.println(ref.getNumero());

 //       lista.remove(0);
 //       System.out.println("Tamanho: " + lista.size());
        
        ContaCorrente cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);
        
        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-------");

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
