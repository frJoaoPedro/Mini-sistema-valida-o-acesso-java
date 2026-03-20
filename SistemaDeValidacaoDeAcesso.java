import java.util.Scanner;
public class SistemaDeValidacaoDeAcesso{
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        String nome;
        int idade;
        int NivelDeAcesso;

        System.out.println(" < Seja muito Bem vindo Usuário > ");
        System.out.println("Esté programa irá definir seu acesso ao arquivo x");
        System.out.println("Vamos pedir seu nome, idade, e Nível de acesso");
        System.out.println("Nos temos Níveis de acesso de 1 a 3, onde cada um tem permissões personalizadas");
        System.out.println("porém, lembre-se que somos bem restritos quanto a menores de idade... idependente do Nível deAcesso");
        System.out.println("Primeiro, digite aqui seu nome: ");


        nome = Leitor.nextLine();

        System.out.println("agora " + nome + " digite sua idade: ");
        idade = Leitor.nextInt();

        System.out.println(" agora por fim digite aqui seu Nível de Acesso: ");
        NivelDeAcesso = Leitor.nextInt();

        if(idade < 18){
            System.out.println("idependentemente do seu Nível de acesso. Acesso negado por ser menor de idade! ");
        }
        else{
            if(NivelDeAcesso == 1){
                System.out.println("Você é Visitante, sendo assim voce ganha: ");
                System.out.print("Acesso Básico: Você so pode ler! ");
                System.out.println(" Bem vindo ao arquivo X");
            }
            else if(NivelDeAcesso == 2){
                System.out.println(" Você é colaborador, sendo assim você ganha: ");
                System.out.print("Acesso Médio: Você pode ler e escrever! ");
                System.out.println(" Bem vindo ao arquivo X");
            }
            else if(NivelDeAcesso == 3){
                System.out.println("Você é adimin, Sendo assim você ganha: ");
                System.out.print(" Acesso completamente liberado");
                System.out.println(" Bem vindo ao arquivo X");
            }
            else{
                System.out.println(" Cara, o Nível vai so de 1 a 3 ok? tente novamente");
            }
            
        }
        Leitor.close();
    }
}