package com.example.quiz;

public class Quiz {

	String qstOne = //A
	"\n1 - Java é uma linguagem:\n\n"
	+ "A - Altamente tipada e orientada a objetos.\n"
	+ "B - Não tipada e não orientada a objetos.\n"
    + "C - Altamente tipada, orientada a objetos e não possui classes prontas.\n"
    + "D - Interpretada.\n"
    + "E - Interpretada, de tipagem dinâmica e multiparadigma.\n";

    public void printQstOne() {
        System.out.println(qstOne);
    }
    
    String qstTwo = //D
    "\n2 - Em Java, palavras-chave como public, protected e private são modificadoras de acesso ou de visibilidade e podem ser utilizadas em classes e seus atributos e métodos para definir acessos mais ou menos restritos a esses elementos. Na ordem de menos restrito para mais restrito, os tipos de acesso que essas palavras-chave (ou a ausência delas) podem definir são:\n"
    + "A - Público, padrão, protegido e privado.\n"
    + "B - Amigo, público, padrão e privado.\n"
    + "C - Público, amigo, protegido e privado.\n"
    + "D - Público, protegido, padrão e privado.\n"
    + "E - Padrão, público, privado e protegido.\n";
    
    public void printQstTwo() {
        System.out.println(qstTwo);
    }
    
    String qstThree = //B
    	    "\n3 - Sobre a linguagem de programação Java, é correto afirmar:\n"
    	    + "A - Possibilita o uso de herança simples e múltipla.\n"
    	    + "B - Utiliza o processo de garbage collector para remover trechos de código que não sejam utilizados.\n"
    	    + "C - Faz uso da lógica de ponteiros para o armazenamento de informações.\n"
    	    + "D - Adota o conceito de multithreading.\n"
    	    + "E - Java Virtual Machine (JVM) é um software que emula diversos sistemas operacionais.\n";
    	    
    	    public void printQstThree() {
    	        System.out.println(qstThree);
    	    }
    	    
    	    String qstFour =//C
    	    	    "\n4 - Marcos está trabalhando em um projeto de sistemas em Java e quer garantir que o atributo de uma classe seja inicializado apenas uma vez e que seu valor não possa ser modificado posteriormente. Na linguagem de programação Java, esse atributo deve ser definido com o modificador:\n"
    	    	    + "A - Abstract.\n"
    	    	    + "B - Default.\n"
    	    	    + "C - Final.\n"
    	    	    + "D - Native.\n"
    	    	    + "E - Volatile.\n";
    	    	    
    	    	    public void printQstFour() {
    	    	        System.out.println(qstFour);
    	    	    }
    	    	    
    	    	    String qstFive = //E
    	    	    	    "\n5 - Qual comando é responsável por criar uma instância de uma classe?\n"
    	    	    	    + "A - main.\n"
    	    	    	    + "B - public.\n"
    	    	    	    + "C - static.\n"
    	    	    	    + "D - void.\n"
    	    	    	    + "E - new.\n";
    	    	    	    
    	    	    	    public void printQstFive() {
    	    	    	        System.out.println(qstFive);
    	    	    	    } 	    
}