package com.mycompany.one;

/** 
 * 
 * Jefferson Oliveira
 * 
 * Esta classe implementa o padrão Singleton, que garante que apenas uma
 * instância da classe seja criada.
 * 
*/
public class Singleton {
    /** 
     * 
     * Variável estática que armazena a única instância da classe Singleton.
    */
    private static Singleton instance;
    
    /**
     * 
     * Variável de instância para armazenar o parametro do tipo String Enviado.
    */ 
    public String value;

    /** 
     * 
     * Este construtor é privado para evitar a instanciação direta da classe fora dela mesma.
    */
    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            // Caso ocorra um erro ele exibe no output da aplicação
            ex.printStackTrace();
        }
        // Atribui o valor do argumento ao atributo value da instância atual.
        this.value = value;
    }

    /** 
     * 
     * Método estático que retorna a instância Singleton.
    */ 
    public static Singleton getInstance(String value) {
        // Se a instância ainda não foi criada, cria uma nova.
        if (instance == null) {
            instance = new Singleton(value);
        }
        // Retorna a instância Singleton.
        return instance;
    }
}
