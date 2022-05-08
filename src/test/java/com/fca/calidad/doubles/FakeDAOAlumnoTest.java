package com.fca.calidad.doubles;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.is;

public class FakeDAOAlumnoTest {
	
	private FakeMySQLAlumnoDAO dao;
	private Alumno alumno;
	
	public HashMap<Integer, Alumno> alumno_db;
	

	@Before
	public void setUp() throws Exception {
		dao = Mockito.mock(FakeMySQLAlumnoDAO.class);
		alumno_db = new HashMap<Integer, Alumno>();
		alumno_db.put(2, new Alumno(2, "nombre2",15,"correro"));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void createAlumnotest() {
		//int id, String nombre, int edad, String email
		alumno = new Alumno(1, "nombre", 15,"email");
		
		//Vamos a probar el método createAlumno
		//tenemos que programar el comportamiento
		when(dao.addAlumno(any(Alumno.class))).thenAnswer(new Answer<Boolean>(){
			
			public Boolean answer(InvocationOnMock invocation)throws Throwable{
				Alumno arg = (Alumno) invocation.getArguments()[0];
				
				alumno_db.put(arg.getId(), arg);
				return true;
			}
		});
		
		//Ejercitar el código
		int sizeAntes = alumno_db.size();
		dao.addAlumno(alumno);
		int sizeDesp = alumno_db.size();
		//Verificar
		assertThat(sizeDesp, is(sizeAntes + 1));
		
	}


}
