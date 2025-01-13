package grupos.divide;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AgruparPorGenero {
    public static void main(String[] args) {
        Set<String> grupoMasc = new HashSet<>();
        Set<String> grupoFem = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
        	System.out.println("adicione um nome ou digite 'sair' para encerrar.");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("sair")) {
                break;
            }
            
            System.out.println("digite o sexo 'm' para masculino 'f' para feminino");
            
            String sexo = sc.nextLine();
            
            if (sexo.equalsIgnoreCase("m")) {
                grupoMasc.add(name);
            }
            else if (sexo.equalsIgnoreCase("f")) {
                grupoFem.add(name);
            }
            else {
            	System.out.println("insira um sexo valido");
            }
        }
        
        System.out.println("--- Grupo Masculino ---");
        System.out.println(grupoMasc);
        
        System.out.println("--- Grupo Feminino ---");
        System.out.println(grupoFem);
    }
}