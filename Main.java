import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Banco> inimigos=new ArrayList<>();
        System.out.println("DIGITE O NOME DO HEROI!");
        String nome=sc.next();
        System.out.println("ESCOLHA SUA CLASSE!");
        System.out.println("DIGITE O SEU NIVEL!");
        int nivel=sc.nextInt();
        System.out.println("DIGITE SUA VIDA!");
        double vida=sc.nextInt();
        double dano=vida/3;
        Banco heroi=new Banco(nome, nivel, vida, dano);
        System.out.println("""
            ESCOLHA SUA CLASSE
            1- CAVALEIRO
            2- MAGO
            3- HUMANO
        """);
        int op=sc.nextInt();
        switch (op) {
            case 1:
                heroi.classe=Classe.CAVALEIRO;
            
                break;
            case 2:
                heroi.classe=Classe.MAGO;

                break;
            case 3:
                heroi.classe=Classe.HUMANO;               
            default:   
                System.out.println("SELECIONE UMA CLASSE VALIDA!");
            break;

            
        }
        System.out.println("SELECIOINE A DIFICULDADE!");
        System.out.println("""
            1- FACIL
            2- MEDIO
            3- DIFICIL    
        """);
        op=sc.nextInt();
        switch (op) {
            case 1:
                
                break;
        
            default:
                break;
        }

    }
}