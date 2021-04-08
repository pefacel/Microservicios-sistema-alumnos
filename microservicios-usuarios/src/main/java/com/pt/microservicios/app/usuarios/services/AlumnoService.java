package com.pt.microservicios.app.usuarios.services;

import java.util.List;

import com.pt.microservicios.commons.alumnos.models.Alumno;
import com.pt.microservicios.commons.services.CommonService;

public interface AlumnoService extends CommonService<Alumno> {

	public List<Alumno> findByNombreOrApellido(String term);

	
}
