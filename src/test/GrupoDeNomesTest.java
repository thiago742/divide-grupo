package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class GrupoDeNomesTest {

	@Test
	void testNamesFem() {
        List<String> namesFem = Arrays.asList("carol-f", "julia-f", "ana-f");
        
        assertTrue(
                namesFem.stream().allMatch(name -> name.endsWith("-f")),
                "Nem todos os nomes na lista terminam com '-f'"
            );
	}
	
	@Test
	void testNamesMasc() {
        List<String> namesMasc = Arrays.asList("thiago-m", "julio-m", "andre-m");
        
        assertTrue(
                namesMasc.stream().allMatch(name -> name.endsWith("-m")),
                "Nem todos os nomes na lista terminam com '-m'"
            );
	}

}
