package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {
        
//        int[] idades = new int[5];
//
//        String[] nomes = new String[5];

        int idade = 29;//Integer
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.doubleValue()); // unboxing
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        
        int valor = idadeRef.intValue(); // unboxing
        String s = args[0]; //10
        
        int numero = Integer.parseInt(s);
        System.out.println(numero);
        
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing
        


        /*
         * Integer idadeRef = 29; //autoboxinng, é criado um objeto do tipo Integer
         * int primitivo = new Integer(21); //que locura!! unboxing
         * 
         * List<Integer> lista = new ArrayList<>();
         * lista.add(idadeRef); //ok
         * lista.add(primitivo); //autoboxing
         * 
         * int i1 = lista.get(0); //unboxing
         * Integer i2 = lista.get(1); //ok
         * 
         * System.out.println(i1); //29
         * System.out.println(i2); //21
         */   
        }

}
