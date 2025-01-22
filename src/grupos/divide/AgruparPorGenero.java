package grupos.divide;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.stream.Collectors;

public class AgruparPorGenero {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("liste nomes com gêneros m para masculino e f para feminino (ex: julio-m) separados por ',' ");
        
        String resposta = sc.nextLine();
        
        List<String> names = Arrays.stream(resposta.split(","))
        	    .collect(Collectors.toList()); 
        
        List<String> namesFem = Arrays.stream(resposta.split(","))
        		.filter(entry -> entry.endsWith("-f"))
        	    .map(entry -> entry.split("-")[0])
        	    .collect(Collectors.toList()); 
        
        List<String> namesMasc = Arrays.stream(resposta.split(","))
        		.filter(entry -> entry.endsWith("-m"))
        	    .map(entry -> entry.split("-")[0])
        	    .collect(Collectors.toList()); 
		
	
        System.out.println("--- Lista de pessoas ---");
        System.out.println(names);
        
        System.out.println("--- Lista feminina ---");
        System.out.println(namesFem);
        
        System.out.println("--- Lista masculina ---");
        System.out.println(namesMasc);
        
        sc.close();
    }

}