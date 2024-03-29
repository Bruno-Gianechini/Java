/*
DESAFIO: A prefeitura da cidade B, inspirada por uma cidade A, decidiu implementar um sistema de câmeras que iria verificar se os carros estão acima de 80km/h. Porém, eles queriam também anotar a placa dos carros no banco de dados para que, a partir de 3 multas, os motoristas perdessem pontos diretamente na carteira de habilitação. Para isso, contrataram você para realizar esse programa, logo que você fez um trabalho tão bom para a cidade A.
OBS: toda vez que um carro é pego pela câmera e está acima da velocidade permitida automaticamente já é contabilizado uma multa para ele.

ENTRADA: A entrada será a velocidade que o veículo está e quantas multas ele já recebeu. Se ele estiver acima da velocidade, deve ser somado mais uma multa.

SAÍDA: A saída deverá ser quantas multas o motorista já tem e se ele irá receber pontuação na carteira de habilitação.

EXEMPLO:

    ENTRADA:
    80
    1
    SAÍDA:
    "1 multas. Nao levou pontos na carteira"

    ENTRADA:
    85
    1
    SAÍDA:
    "2 multas. Nao levou pontos na carteira"

    ENTRADA:
    95
    2
    SAÍDA:
    "3 multas. Levou pontos na carteira"

*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        
        // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade
        {
          if (velocidade > 80)
        {
          multas = multas +1;
        }
        }
            
        {
          if (multas >= 3)
        {
          System.out.println(multas + " multas. Levou pontos na carteira");
        }
          else
        {
          System.out.println(multas + " multas. Nao levou pontos na carteira");
        }
        }
    }
}