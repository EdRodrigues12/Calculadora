package br.fatec.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.servico.Calculadora;

public class UC01SomaDeParcelas {
	
	static Calculadora calculadora;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculadora  = new Calculadora();
	}
	
	@Test
	public  void UC01SomaDeParcelas_com_sucesso(){
		assertEquals("Resultado =",5,calculadora.soma("3,2"));
	}
	
	@Test (expected = RuntimeException.class)
	public  void UC01SomaDeParcelas_dados_invalidos_sucesso(){
		assertEquals("Resultado =",5,calculadora.soma("x,2"));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
