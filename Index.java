
import java.util.Scanner;                                                                                
public class Index {                                                                                     
    public static void main (String[]args) {                                                             
        Scanner menu = new Scanner(System.in);                                                             
        // 1
        System.out.print("##--Teste--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Determinar se um ano é bissexto|\n");
        System.out.print("| Opção 2 - Sequência de Fibonnachi|\n");
        System.out.print("| Opção 3 -        |\n");
        System.out.print("| Opção 4 - Solicitar a temperatura|\n");
        System.out.print("| Opção 5 - Verificar idade|\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();

        switch (opcao) {
        case 1:
            System.out.print("Digite o ano");
            int ano = menu.nextInt();
            System.out.print("O ano é bissexto? " + AnoBissexto(ano));
            break;

        case 2:
            System.out.print("\n \n");
            break;

        case 3:
            System.out.print("\n \n");
            break;

        case 4:
            System.out.println("Digite uma temperatura: ");                                                  
            int temp = menu.nextInt();                                                                         
            if (temp > 35) {                                                                                 
                System.out.println("Temperatura maior que 35 você precisa usar protetor solar");             
            } else {                                                                                         
                System.out.println("Temperatura menor que 35 você não precisa usar protetor solar");         
            } 
            menu.close();       

        case 5:
            System.out.println("Digite sua idade: ");                                                  
            int age = menu.nextInt();                                                                         
            if (age > 18) {                                                                                 
                System.out.println("Você é maior de idade");             
            } else {                                                                                         
                System.out.println("Você é menor de idade");         
            }   
            break;

        default:
            System.out.print("\nOpção Inválida!");
            break;

        }
	
	public static Boolean AnoBissexto(int ano) { 
		if(ano % 4 == 0 && ((ano % 100 != 0) || (ano % 400 == 0))){
			return true;
		}
		return false;
	}                                                                                                                                                                                                                                                                
}                                                                                           