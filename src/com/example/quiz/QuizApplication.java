package com.example.quiz;

import java.util.Scanner;

public class QuizApplication
{

    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);

        QuizService quizService = new QuizServiceImpl();
        Quiz quiz = new Quiz();

        quiz.printQstOne();
        System.out.println("Digite sua resposta:");
        String respQstOneUser = scanner.nextLine();

        boolean respCorreta = false;

        while (!respCorreta)
        {
            respCorreta = quizService.validarResposta(respQstOneUser, "A");

            if (respCorreta)
            {
                System.out.println("Resposta correta!");
            } else 
            {
                System.out.println("Resposta errada! Tente novamente.");
                respQstOneUser = scanner.nextLine();
            }
        }

        quiz.printQstTwo();
        System.out.println("Digite sua resposta:");
        String respQstTwoUser = scanner.nextLine();

        boolean respCorretaQstTwo = false;

        while (!respCorretaQstTwo )
        {
        	respCorretaQstTwo = quizService.validarResposta(respQstTwoUser, "D");

            if (respCorretaQstTwo)
            {
                System.out.println("Resposta correta!");
            } else
            {
                System.out.println("Resposta errada! Tente novamente.");
                respQstTwoUser = scanner.nextLine();
            }
        }
        
        quiz.printQstThree();
        System.out.println("Digite sua resposta:");
        String respQstThree = scanner.nextLine();

        boolean respCorretaQstThree = false;

        while (!respCorretaQstThree )
        {
        	respCorretaQstThree = quizService.validarResposta(respQstThree, "B");

            if (respCorretaQstThree)
            {
                System.out.println("Resposta correta!");
            } else
            {
                System.out.println("Resposta errada! Tente novamente.");
                respQstThree = scanner.nextLine();
            }
        }
        
        quiz.printQstFour();
        System.out.println("Digite sua resposta:");
        String respQstFour= scanner.nextLine();

        boolean respCorretaQstFour = false;

        while (!respCorretaQstFour )
        {
        	respCorretaQstFour = quizService.validarResposta(respQstFour, "C");

            if (respCorretaQstFour)
            {
                System.out.println("Resposta correta!");
            } else
            {
                System.out.println("Resposta errada! Tente novamente.");
                respQstFour = scanner.nextLine();
            }
        }
        
        quiz.printQstFive();
        System.out.println("Digite sua resposta:");
        String respQstFive= scanner.nextLine();

        boolean respCorretaQstFive = false;

        while (!respCorretaQstFive)
        {
        	respCorretaQstFive = quizService.validarResposta(respQstFive, "E");

            if (respCorretaQstFive)
            {
                System.out.println("Resposta correta!");
            } else
            {
                System.out.println("Resposta errada! Tente novamente.");
                respQstFive = scanner.nextLine();
            }
        }
        
        System.out.println("\nParabéns, você terminou o Quiz!"); 
    }
}