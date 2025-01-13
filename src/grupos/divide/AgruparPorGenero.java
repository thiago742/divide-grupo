package grupos.divide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AgruparPorGenero {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("digite os nomes separados por , ");
        
        String resposta = sc.nextLine();
        
        
        
        List<String> names = new ArrayList<>();
        for (String name : resposta.split(",")) {
            names.add(name.trim());
        }        
        
        Set<String> grupoMasc = new TreeSet<>();
        Set<String> grupoFem = new TreeSet<>();
        
		for (String name : names) {
			
            System.out.println("digite o sexo de " + name + ", insira 'm' para masculino ou 'f' para feminino");
            
            String sexo = sc.nextLine();
            
            if (sexo.equalsIgnoreCase("m")) {
                grupoMasc.add(name);
            }
            else if (sexo.equalsIgnoreCase("f")) {
                grupoFem.add(name);
            }
            while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                System.out.println("Insira um sexo válido ('m' ou 'f'):");
                sexo = sc.nextLine();
            }

        }
        
        System.out.println("--- Grupo Masculino ---");
        System.out.println(grupoMasc);
        
        System.out.println("--- Grupo Feminino ---");
        System.out.println(grupoFem);
        
        sc.close();
    }
}