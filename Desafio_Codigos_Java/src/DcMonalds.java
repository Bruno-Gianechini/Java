/*
DESAFIO: Você levou sua namorada na incrível rede de lanchonetes Dc Monalds e ficou maravilhado como aquele lanche era gostoso. Porém, ficou horrorizado como algumas coisas no aplicativo do cardápio estavam erradas. Então, você se ofereceu para ajudá-los com seus conhecimentos de programação. Ao conversar com o gerente, ele te explicou que a vontade da lanchonete era criar um menu com os nomes dos ingredientes formando o lanche, como no exemplo abaixo:

Pao
Presunto
Carne
Pao

Ajude o restaurante a programar isso.

ENTRADA: A entrada serão os ingredientes que compõem o lanche.

SAÍDA: A saída deverá ser o lanche montado com as palavras que definem os ingredientes.

EXEMPLO:

    ENTRADA: Pao;Picles;Tomate;Pao
    SAÍDA:  Pao
            Picles
            Tomate
            Pao

    ENTRADA: Pao;Presunto;Carne;Pao
    SAÍDA:  Pao
            Presunto
            Carne
            Pao

*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 
// - O método .split() quebra uma String em várias substrings a partir de um caracter definido por você e coloca em um array. 

import java.util.Scanner; 
    
public class DcMonalds {
    public static void main(String[] args) {
        //Scanner leitor = new Scanner(System.in);
        String ingredientes = "Pao;Presunto;Carne;Pao";
        String listaIngredientes[] = new String[3];
        
        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
        
        listaIngredientes = ingredientes.split(";");
        System.out.println(listaIngredientes[0]);
        System.out.println(listaIngredientes[1]);
        System.out.println(listaIngredientes[2]);
        System.out.println(listaIngredientes[3]);
    }
}