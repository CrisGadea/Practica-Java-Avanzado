package clasesTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import clases.Pokemon;
import utils.Tipo;

class PokemonTest {

	@Test
	void test() {
		
	}
	
	@Test
	void testQuePruebaQuePuedoCrearUnPokemon() {
		Pokemon poke1 = new Pokemon();
		assertNotNull(poke1);
	}
	
	@Test
	void testQuePruebaQuePodemosCrearUnPokemonConNombre() {
		Pokemon poke1 = new Pokemon();
		poke1.setNombre("Pikachu");
		String obtenido = poke1.getNombre();
		String esperado = "Pikachu";
		assertEquals(obtenido, esperado);
	}
	
	@Test
	void testQuePruebaQueUnPokemonEsDiferenteAOtro(){
		Pokemon poke1 = new Pokemon();
		Pokemon poke2 = new Pokemon();
		poke1.setId(1L);
		assertNotEquals(poke1, poke2);
	}
	
	@Test
	void testQuePruebaQuePuedoCrearUnPokemonConSusDatosYSuTipo() {
		Pokemon poke1 = new Pokemon("Pikachu", Tipo.RAYO);
		assertNotNull(poke1);
		assertEquals(Tipo.RAYO, poke1.getTipo());
	}

	@Test
	void testQuePruebaQueUnPokemonPuedeObtenerHabilidades() {
		Pokemon poke1 = new Pokemon("Pikachu", Tipo.RAYO);
		String hab1 = "Impactrueno";
		String hab2 = "Cola de Acero";
		Boolean areEquales = false;
		List<String> habilidades = new ArrayList<String>();
		
		habilidades.add(hab1);
		habilidades.add(hab2);
		
		poke1.setHabilidades(habilidades);
		
		List<String> HabilidadesAdquiridas = poke1.getHabilidades().stream()
		.filter(p -> p.equals(hab1))
		.collect(Collectors.toList());
		
		assertNotEquals(HabilidadesAdquiridas, poke1.getHabilidades());
	}
	//TODO: Test que quedan
}
