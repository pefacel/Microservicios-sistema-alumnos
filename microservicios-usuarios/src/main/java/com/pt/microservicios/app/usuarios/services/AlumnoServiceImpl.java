package com.pt.microservicios.app.usuarios.services;


import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pt.microservicios.app.usuarios.model.repository.AlumnoRepository;
import com.pt.microservicios.commons.alumnos.models.Alumno;
import com.pt.microservicios.commons.services.CommonServiceImpl;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String term) {
		return repository.findByNombreOrApellido(term);
	}



}
