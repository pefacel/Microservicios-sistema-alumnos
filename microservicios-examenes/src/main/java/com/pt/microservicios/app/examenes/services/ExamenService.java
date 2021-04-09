package com.pt.microservicios.app.examenes.services;

import java.util.List;

import com.pt.microservicios.commons.examenes.models.entity.Asignatura;
import com.pt.microservicios.commons.examenes.models.entity.Examen;
import com.pt.microservicios.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen> {

	public List<Examen> findByNombre(String term);

	public List<Asignatura> findAllAsignaturas();
}
