<p align="center">
    <img src="imagens\javaQuizImage.png">
    <br>
    <h1 align="center">
    📝 JAVA QUIZ BACK END 📝
    </h1>
</p>
<br>
<h2>
    :mag: ACESSE O CÓDIGO DO PROJETO NO LINK ABAIXO
</h2>

```
https://github.com/Lucas4fs/quiz-java/tree/main/src/com/example/quiz
```

<h2>
    :mag: ACESSE UM VÍDEO EXPLICATIVO QUE MOSTRA TODA A CRIAÇÃO DO PROJETO NO LINK ABAIXO
</h2>

```
https://drive.google.com/file/d/1v_ycCEZl6O7TR0WYTTcQISq519OZP7d1/view
``` 
<h3>
    :pushpin: Intuito do Projeto
</h3>

<p>
    Criar um quiz usando a linguagem Java.
</p>

<h3>
    :pushpin: Como Funciona o Quiz
</h3>

<p>
    O quiz contém 5 perguntas e enquanto o usuário não conseguir acertar a pergunta atual não consegue passar para a próxima, depois que conseguir responder corretamente todas as perguntas o quiz se encerra.
</p>

<h3>
    :pushpin: Regras que Foram Seguidas Durante a Criação do Código
</h3>

<p>
    Ao invês de manter as perguntas, variáveis que amarzenam a resposta do usuário e a validação da resposta em uma única classe iremos fazer diferente, vamos explorar a linguagem Java usando uma interface(contrato que deve ser seguido) terá um método que quando for chamado irá validar se a resposta fornecida pelo usuário está correta ou não, caso a resposta esteja correta o usuário passa para a próxima pergunta, caso a resposta esteja errada o usuário deve tentar digitar uma nova resposta até acertar a questão, enquando não acertar não passará para a próxima pergunta, a criação desse código será explicada detalhadamente. Vale lembrar que existem diversas formas de criar o projeto, mas nesse caso iremos seguir essa política de codificação.
</p>

<h3>
    :pushpin: Segue Abaixo um Diagrama que Explica de Forma mais Didática como será o Comportamento/Comunicação das Classes Dentro da IDE
</h3>

<img src = "imagens\diagrama.png">

<h3>
    :pushpin:Começando o Código
</h3>

<li>
    Classe QuizApplication
</li>

<p>
    Vale lembrar que todas as classes ficaram dentro do mesmo pacote e durante a explicação as partes do código estão divididas para que cada parte possa ser explicada, abaixo o primeiro código se refere ao pacote do projeto(que armazenará as classes), o segundo importa uma classe pronta do Java que está dentro de outro pacote e será usada para escanear valores.
</p>

```java
package com.example.quiz;

import java.util.Scanner;
```
<p>
Declaramos a classe que QuizApplication como algo público, essa classe sendo pública qualquer outra classe poderá acessá-la.
</p>

```java
public class QuizApplication
{
```
<p>
    A palavra-chave <strong>public</strong> indica que o método <strong>main()</strong> é acessível a partir de qualquer classe. A palavra-chave <strong>static</strong> indica que o método <strong>main()</strong> pertence à classe, não a uma instância específica da classe. A palavra-chave <strong>void</strong> indica que o método <strong>main()</strong> não retorna nenhum valor.O parâmetro <strong>args</strong> é um array de strings que contém os argumentos da linha de comando. Se nenhum argumento for especificado na linha de comando, o array args estará vazio, o corpo do método main() é onde o código do programa é executado. 
</p>

```java
    public static void main(String[] args)
    {
```
<p>
    Variável <strong>scanner</strong> moldada pela classe <strong>Scanner</strong> é instanciada como um novo objeto da classe <strong>Scanner</strong> que contém <strong>System.in</strong> como argumento, <strong>System.in</strong> está representando o teclado do usuário que será usado para ler dados do teclado.
</p>

```java     
        Scanner scanner = new Scanner(System.in);
```
<p>
    Variável <strong>quizService</strong> moldada pela classe <strong>QuizService</strong> sendo instanciada como um objeto da classe <strong>QuizServiceImpl</strong>.
</p>

```java 
        QuizService quizService = new QuizServiceImpl();
```

<p>
    Variável <strong>quiz</strong> moldada pela classe <strong>Quiz</strong> sendo instanciada como um objeto da classe <strong>Quiz</strong>.
</p>

```java
        Quiz quiz = new Quiz();
```

<p>
    Objeto <strong>quiz</strong> chama o método <strong>printQstOne()</strong>, esse método pertence a classe <strong>Quiz</strong> e é responsável por imprimir o objeto <strong>qstOne</strong> que recebe o texto da primeira questão.
</p>

```java
        quiz.printQstOne();
```

<p>
    Depois que a pergunta for exibida para o usuário a frase abaixo será imprimida:
</p>

```java
        System.out.println("Digite sua resposta:");
``` 
<p>
    A variável <strong>respQstOneUser</strong> recebe o objeto scanner que chama o método <strong>nextLine()</strong> que pega o próximo valor digitado pelo usuário. Nesse momento o usuário digita a resposta da pergunta.
</p>

```java
        String respQstOneUser = scanner.nextLine();
```
<p>
    A variável <strong>respCorreta</strong> do tipo booleana recebe <strong>false</strong>.
</p>

```java
        boolean respCorreta = false;
```
<p>
    Aqui se inicia um loop(laço), enquanto a variável <strong>respCorreta</strong> não for true(verdade) esse loop irá acontecer.
</p>

```java
        while (!respCorreta)
        {
```
<p>
    A variável <strong>respCorreta</strong> recebe o objeto <strong>quizService</strong> que chama o método <strong>validarResposta</strong> pertencente a classe <strong>QuizService</strong> passando dois argumentos, <strong>respQstOneUser</strong>(que armazenou a resposta do usuário) e a letra <strong>A</strong> que é a resposta correta, mais a frente vamos entender como esse método funciona, mas até aqui basta saber que ele valida se a resposta do usuário está igual a resposta correta.
</p>

```java
            respCorreta = quizService.validarResposta(respQstOneUser, "A");
```
<p>
    E se o objeto <strong>respCorreta</strong> for true(verdade) a frase <strong>Resposta correta!</strong> será exibida.
</p>

```java
            if (respCorreta)
            {
                System.out.println("Resposta correta!");
```
<p>
    Se não a frase <strong>"Resposta errada! Tente novamente."</strong> será exibida e a variável <strong>respQstOneUser</strong> receberá um novo valor digitado pelo usuário.
</p>

```java
            } else 
            {
                System.out.println("Resposta errada! Tente novamente.");
                respQstOneUser = scanner.nextLine();
            
            }
```
<p>
    Ficará nesse loop(laço) infinitamente até que o usuário digite uma resposta correta, depois que digitar o código para de rodar no loop e começa a rodar fora do loop dando continuidade.
</p>

```java
        }
```

<p>
    Depois disso temos mais 4 questões, são elas: <strong>printQstTwo</strong>, <strong>printQstThree</strong>, <strong>printQstFour</strong> e <strong>printQstFive</strong>, todas serão exibidas para o usuário e a mesma lógica da <strong>printQstOne</strong> se aplica as demais perguntas, segue o resto do código:
</p>

```java
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
```
<p>
   Por fim, quando o usuário acertar todas as questões a frase abaixo será exibida:
</p>

```java
        System.out.println("\nParabéns, você terminou o Quiz!"); 
    }
}
```

<li>
    Classe Quiz
</li>

<p>
    É a classe que contém os objetos que armazenam os textos das perguntas e os métodos que imprimem as perguntas.Vamos começar declarando o pacote.
</p>

```java
package com.example.quiz;
```

<p>
   Depois declaramos a classe sendo pública. Essa classe sendo pública qualquer outra classe pode acessá-la.
</p>

```java
public class Quiz
{
```

<p>
   A variável irá receber o texto da primeira questão.
</p>

```java 
    String qstOne =
    "\n1 - Java é uma linguagem:\n\n"
    + "A - Altamente tipada e orientada a objetos.\n" //RESP
    + "B - Não tipada e não orientada a objetos.\n"
    + "C - Altamente tipada, orientada a objetos e não possui classes prontas.\n"
    + "D - Interpretada.\n"
    + "E - Interpretada, de tipagem dinâmica e multiparadigma.\n";
```

<p>
   Depois criamos um método do tipo público vazio, esse método imprime o objeto que contém o texto da primeira questão.
</p>

```java
    public void printQstOne()
    {
        System.out.println(qstOne);
    }
```

<p>
    A mesma lógica segue para as demais perguntas, cada uma terá um objeto que irá armazenar o texto da pergunta e o método que irá imprimir esse objeto.
</p>
    
```java
    String qstTwo =
    "\n2 - Em Java, palavras-chave como public, protected e private são modificadoras de acesso ou de visibilidade e podem ser utilizadas em classes e seus atributos e métodos para definir acessos mais ou menos restritos a esses elementos. Na ordem de menos restrito para mais restrito, os tipos de acesso que essas palavras-chave (ou a ausência delas) podem definir são:\n"
    + "A - Público, padrão, protegido e privado.\n"
    + "B - Amigo, público, padrão e privado.\n"
    + "C - Público, amigo, protegido e privado.\n"
    + "D - Público, protegido, padrão e privado.\n" //RESP
    + "E - Padrão, público, privado e protegido.\n";
    
    public void printQstTwo()
    {
        System.out.println(qstTwo);
    }
    
    String qstThree = 
    "\n3 - Sobre a linguagem de programação Java, é correto afirmar:\n"
    + "A - Possibilita o uso de herança simples e múltipla.\n"
    + "B - Utiliza o processo de garbage collector para remover trechos de código que não sejam utilizados.\n" //RESP
    + "C - Faz uso da lógica de ponteiros para o armazenamento de informações.\n"
    + "D - Adota o conceito de multithreading.\n"
    + "E - Java Virtual Machine (JVM) é um software que emula diversos sistemas operacionais.\n";
    	    
    public void printQstThree()
    {
    	System.out.println(qstThree);
    }
    	    
    String qstFour =
    "\n4 - Marcos está trabalhando em um projeto de sistemas em Java e quer garantir que o atributo de uma classe seja inicializado apenas uma vez e que seu valor não possa ser modificado posteriormente. Na linguagem de programação Java, esse atributo deve ser definido com o modificador:\n"
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
    "\n5 - Qual comando é responsável por criar uma instância de uma classe?\n"
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
```

<li>
    Interface QuizService
</li>

<p>
    É a interface que contém o serviço para validar se a resposta do usuário é igual a resposta correta.Vamos começar declarando nosso pacote.
</p>

```java
package com.example.quiz;
```

<p>
    Depois declaramos a interface.
</p>

```java
public interface QuizService
{
```

<p>
    A interface é booleana e contém duas varáveis que irá receber dois argumentos, <strong>resposta</strong> que recebe a resposta do usuário e <strong>respostaCorreta</strong> que recebe a resposta correta da pergunta.
</p>

```java
    boolean validarResposta(String resposta, String respostaCorreta);
}
```

<li>
    Classe QuizServiceImpl
</li>

<p>
    É a classe que implementa e segue o contrato da interface. Vamos começar declarando nosso pacote.
</p>

```java
package com.example.quiz;
```

<p>
    Depois declaramos a classe (como pública, permitindo que a classe pode ser acessada de qualquer outra classe) que implementa a interface, ou seja, a classe irá seguir o contrato da interface.
</p>

```java
public class QuizServiceImpl implements QuizService
{
```

<p>
    Implementamos o método <strong>validarResposta</strong> fazendo sobreposição com <strong>@Override</strong>, ou seja, estamos usando um método da classe <strong>QuizService</strong>(seguindo o contrato) mas vamos usar o método do nosso jeito, fazendo as nossas alterações, estamos tornando o método público e também vamos definir um retorno.
</p>

```java
public boolean validarResposta(String resposta, String respostaCorreta)
{
```

<p>
    Definimos o retorno que é a comparação do primeiro argumento <strong>resposta</strong> com o segundo argumento <strong>respostaCorreta</strong>. O primeiro argumento <strong>resposta</strong> chama um método pronto que é o  <strong>equalsIgnoreCase</strong>(pertencente a classe <strong>String</strong> e que realiza comparação do conteúdo dentro do objeto para ver se ambos são iguais , sem considerar a "Case" que no caso é o fato da letra ser maiúscula ou minúscula), logo depois passamos <strong>respostaCorreta</strong> como argumento do método, ou seja, comparar se o conteúdo que está no objeto <strong>resposta</strong> é igual ao contéudo que está no objeto <strong>respostaCorreta</strong>.Como o método é do tipo boolean(boleano) o retorno será true(verdadeiro) ou false(falso).
</p>

```java
return resposta.equalsIgnoreCase(respostaCorreta);
```

<p>
    Por fim terminamos nosso código. 
</p>

<h3>
    :pushpin:Startando Aplicação
</h3>

<p>
    Chegou o momento de ver a aplicação funcionando, vamos startar a aplicação através da classe principal, ao startar o console já irá nos retornar a primeira pergunta.
</p>

```
1 - Java é uma linguagem:

A - Altamente tipada e orientada a objetos.
B - Não tipada e não orientada a objetos.
C - Altamente tipada, orientada a objetos e não possui classes prontas.
D - Interpretada.
E - Interpretada, de tipagem dinâmica e multiparadigma.

Digite sua resposta:
```

<p>
Sendo assim o quiz prosegue, caso a resposta fornecida seja correta a próxima pergunta é exibida, caso a resposta seja errada o usuário fica preso em um loop que afirma que a resposta está errada até digitar a resposta correta e conseguir sair do loop, passando então para a próxima pergunta, segue a continuação:
</p>

```
1 - Java é uma linguagem:

A - Altamente tipada e orientada a objetos.
B - Não tipada e não orientada a objetos.
C - Altamente tipada, orientada a objetos e não possui classes prontas.
D - Interpretada.
E - Interpretada, de tipagem dinâmica e multiparadigma.

Digite sua resposta:
a
Resposta correta!

2 - Em Java, palavras-chave como public, protected e private são modificadoras de acesso ou de visibilidade e podem ser utilizadas em classes e seus atributos e métodos para definir acessos mais ou menos restritos a esses elementos. Na ordem de menos restrito para mais restrito, os tipos de acesso que essas palavras-chave (ou a ausência delas) podem definir são:
A - Público, padrão, protegido e privado.
B - Amigo, público, padrão e privado.
C - Público, amigo, protegido e privado.
D - Público, protegido, padrão e privado.
E - Padrão, público, privado e protegido.

Digite sua resposta:
b
Resposta errada! Tente novamente.
B
Resposta errada! Tente novamente.
C
Resposta errada! Tente novamente.
D
Resposta correta!

3 - Sobre a linguagem de programação Java, é correto afirmar:
A - Possibilita o uso de herança simples e múltipla.
B - Utiliza o processo de garbage collector para remover trechos de código que não sejam utilizados.
C - Faz uso da lógica de ponteiros para o armazenamento de informações.
D - Adota o conceito de multithreading.
E - Java Virtual Machine (JVM) é um software que emula diversos sistemas operacionais.

Digite sua resposta:
c
Resposta errada! Tente novamente.
b
Resposta correta!

4 - Marcos está trabalhando em um projeto de sistemas em Java e quer garantir que o atributo de uma classe seja inicializado apenas uma vez e que seu valor não possa ser modificado posteriormente. Na linguagem de programação Java, esse atributo deve ser definido com o modificador:
A - Abstract.
B - Default.
C - Final.
D - Native.
E - Volatile.

Digite sua resposta:
e
Resposta errada! Tente novamente.
c
Resposta correta!

5 - Qual comando é responsável por criar uma instância de uma classe?
A - main.
B - public.
C - static.
D - void.
E - new.

Digite sua resposta:
e
Resposta correta!

Parabéns, você terminou o Quiz!
```

<p>
Será disponibilizado aqui nesse documento o gabarito do quiz.
</p>

```
GABARITO:
1 - A
2 - D
3 - B
4 - C
5 - E
```

<h3>
   📌Ferramentas Utilizadas 
</h3>

<li>
    Eclipse
</li>

<p>
IDE de desenvolvimento para códigos usada para criar o código Java.
</p>

<li>
    Microsoft Visual Studio Code(User)
</li>

<p>
IDE de desenvolvimento para códigos, usada para criar o arquivo README.md
</p>

<li>
    Notepad ++
</li>

<p>
Editor de texto e de código fonte usado para fazer anotações.
</p>

<li>
    Java
</li>

<p>
Linguagem POO.
</p>
