package ar.edu.unlp.objetos.uno.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class WalpostTest {
	
	Wallpost uno;
	
	@BeforeEach
	void setUp() throws Exception {
		uno = new Wallpost("uno");
		
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals("uno", uno.getName());
        
    }
}
