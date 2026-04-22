package Sla;

import java.util.Scanner;
import java.util.Locale;


public class Main_Sla {

	public static void main(String[] args) {
		try(Scanner Sc = new Scanner(System.in)){
		Locale.setDefault(Locale.US);
		
		while (true) {
		
        double salario1, internet, energia, combustivel, aluguel, IPTU, IPVA, sair, streaming, investimento, alimento, luz, agua, gastos, restante;
		String nome1, mes;
		
		
		
		
		System.out.print("DIGITE UM NOME: ");
		nome1 = Sc.nextLine();
		
		System.out.print("DIGITE O MES QUE ESTAMOS: ");
		mes = Sc.nextLine();
		
        System.out.print("DIGITE O PRIMEIRO SALARIO: ");
        salario1 = Sc.nextDouble();
        
        System.out.println(" OLÁ " + nome1 + " SEJA BEM-VINDO AO SISTEMA DE GASTOS!");
        System.out.println(" ATUALMENTE O USER RECEBEU R$" + String.format("%.0f", salario1));
        
        System.out.println("###############################");
        
        System.out.println(" ---TABELA DE GASTOS---");
        
        
       System.out.println("");
       System.out.print("INTERNET -> R$");
       internet = Sc.nextInt();
       
       System.out.println("");
       System.out.print("ENERGIA -> R$");
	   energia = Sc.nextInt();
	   
	   System.out.println("");
	   System.out.print("COMBUSTÍVEL -> R$");
	   combustivel = Sc.nextInt();
	   
	   System.out.println("");
	   System.out.print("ALUGUEL -> R$");
	   aluguel = Sc.nextInt();	
	   
	   System.out.println("");
	   System.out.print("IPTU -> R$");
	   IPTU = Sc.nextInt();	
	   
	   System.out.println("");
	   System.out.print("IPVA -> R$");
	   IPVA = Sc.nextInt();
	   
	   System.out.println("");
	   System.out.print("SAIR -> R$");
	   sair = Sc.nextInt();	
	   
	   System.out.println("");
	   System.out.print("STREAMING -> R$");
	   streaming = Sc.nextInt();
	   
	   System.out.println("");
	   System.out.print("INVESTIMENTO -> R$");
	   investimento = Sc.nextInt();	
	   
	   System.out.println("");
	   System.out.print("ALIMENTO -> R$");
	   alimento = Sc.nextInt();	
	   
	   System.out.println("");
	   System.out.print("LUZ -> R$");
	   luz = Sc.nextInt();	
	   
	   System.out.println("");
	   System.out.print("ÁGUA -> R$");
	   agua = Sc.nextInt();	
	   
	   
	   gastos = internet + energia + combustivel + aluguel + IPTU + IPVA + sair + streaming + investimento + alimento + luz + agua;
	   restante = (salario1 - gastos);
	   
	   System.out.println("####################################");
	   
	   
	   System.out.print(" GASTOS DO MES " + mes + " -> R$" + String.format("%.0f", gastos));
	   System.out.println("");
	   System.out.print(" RESTANTE -> R$" + String.format("%.0f", restante));
	   
       System.out.println("");
       System.out.println("####################################");
       
          System.out.println("");
          System.out.print("DESEJA CONTINUAR? (S/N): ");          // DAQUI PRA SEMPRE
          String resposta = Sc.next();
          Sc.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            continue; }
        else if (resposta.equalsIgnoreCase("N")){
        	System.out.println("ADEUS!");
        	break;
        }
        else {
        	System.out.println("RESPOSTA INVALIDA");
        	return;
        }
    }
		Sc.close();
   }
	
}

}