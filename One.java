package com.mycompany.one;

public class One {
    public static void main(String[] args) {
        /**
         * Em resumo a singleton é usada para evitar que uma classe seja
         * instanciada mais de 1 vez, exemplo uma classe da Database não precisa
         * Ter mais de uma instancia criada (2 new Singleton).
         * 
         * Observação: Todos os metodos de uma singleton eles são estaticos.
        */
        Singleton singletonOne = Singleton.getInstance("Cheese");
        Singleton singletonTwo = Singleton.getInstance("Bread");
        
        System.out.println(singletonOne.value);
        System.out.println(singletonTwo.value);
    }
}
