import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Variavel
    int anoDoN = 0,
        anoAtual = 0,
        anoFuturo = 2050,
        saida = 0,
        saida2 = 0;
  //Entrada
  System.out.println("Ano do Nascimento :");
  anoDoN = input.nextInt();
  System.out.println("Ano Atual :");
  anoAtual = input.nextInt();
  //Processamento
  saida = anoDoN - anoAtual;
  saida2 = anoDoN - anoFuturo;
  //Saida
  System.out.println("\nIdade Atual :" + saida);
  System.out.println("Idade em 2050 :" + saida2);

  }
}