package com.example.quiz;

public class QuizServiceImpl implements QuizService
{
	@Override
	public boolean validarResposta(String resposta, String respostaCorreta)
	{
        return resposta.equalsIgnoreCase(respostaCorreta);
    }
}