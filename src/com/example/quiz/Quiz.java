package com.example.quiz;

public class Quiz
{
	String qstOne =
	"\n1 - Java � uma linguagem:\n\n"
	+ "A - Altamente tipada e orientada a objetos.\n" //RESP
	+ "B - N�o tipada e n�o orientada a objetos.\n"
	+ "C - Altamente tipada, orientada a objetos e n�o possui classes prontas.\n"
    + "D - Interpretada.\n"
    + "E - Interpretada, de tipagem din�mica e multiparadigma.\n";

    public void printQstOne()
    {
        System.out.println(qstOne);
    }
    
    String qstTwo =
    "\n2 - Em Java, palavras-chave como public, protected e private s�o modificadoras de acesso ou de visibilidade e podem ser utilizadas em classes e seus atributos e m�todos para definir acessos mais ou menos restritos a esses elementos. Na ordem de menos restrito para mais restrito, os tipos de acesso que essas palavras-chave (ou a aus�ncia delas) podem definir s�o:\n"
    + "A - P�blico, padr�o, protegido e privado.\n"
    + "B - Amigo, p�blico, padr�o e privado.\n"
    + "C - P�blico, amigo, protegido e privado.\n"
    + "D - P�blico, protegido, padr�o e privado.\n" //RESP
    + "E - Padr�o, p�blico, privado e protegido.\n";
    
    public void printQstTwo()
    {
        System.out.println(qstTwo);
    }
    
    String qstThree = 
    "\n3 - Sobre a linguagem de programa��o Java, � correto afirmar:\n"
    + "A - Possibilita o uso de heran�a simples e m�ltipla.\n"
    + "B - Utiliza o processo de garbage collector para remover trechos de c�digo que n�o sejam utilizados.\n" //RESP
    + "C - Faz uso da l�gica de ponteiros para o armazenamento de informa��es.\n"
    + "D - Adota o conceito de multithreading.\n"
    + "E - Java Virtual Machine (JVM) � um software que emula diversos sistemas operacionais.\n";
    	    
    public void printQstThree()
    {
    	System.out.println(qstThree);
    }
    	    
    String qstFour =
    "\n4 - Marcos est� trabalhando em um projeto de sistemas em Java e quer garantir que o atributo de uma classe seja inicializado apenas uma vez e que seu valor n�o possa ser modificado posteriormente. Na linguagem de programa��o Java, esse atributo deve ser definido com o modificador:\n"
    + "A - Abstract.\n"
    + "B - Default.\n"
    + "C - Final.\n" //RESP
    + "D - Native.\n"
    + "E - Volatile.\n";
    	    	    
    public void printQstFour()
    {
    	System.out.println(qstFour);
    }
    	    	    
    String qstFive =
    "\n5 - Qual comando � respons�vel por criar uma inst�ncia de uma classe?\n"
    + "A - main.\n"
    + "B - public.\n"
    + "C - static.\n"
    + "D - void.\n"
    + "E - new.\n"; //RESP
    	    	    	    
    public void printQstFive()
    {
    	System.out.println(qstFive);
    } 	    
}