package com.fca.calidad.unitest;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calculadoraTest {
	public Calculadora miCalculadora;

	@Before
	public void setUp() throws Exception {
		miCalculadora = new Calculadora();
	}
	
	@After
	public void tearDown() throws Exception{
		System.out.println("Este es el teardown");
	}
	
	@Test
	public void sumaPositivosTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(1, 3);
		double resultadoEsperado = 14;
		
		//Verificacion, compararar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	
	@Test
	public void sumaNegativosTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(-1, -3);
		double resultadoEsperado = -4;
		
		//Verificacion, compararar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	
	@Test
	public void sumaConCeroTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(-1, 0);
		double resultadoEsperado = -1;
		
		//Verificacion, compararar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	
	@Test
	public void restaTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.resta(10, 5);
		double resultadoEsperado = 5;
		
		//Verificacion, compararar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	
	@Test
	public void divisionTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.division(10, 5);
		double resultadoEsperado = 2;
		
		//Verificacion, compararar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	
	@Test
	public void multiplicacionTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.multiplicacion(10, 5);
		double resultadoEsperado = 50;
		
		//Verificacion, compararar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	
	

}
