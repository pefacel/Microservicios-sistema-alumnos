package com.pt.microservicios.app.cursos.services;

import com.pt.microservicios.app.cursos.models.entity.Curso;
import com.pt.microservicios.commons.services.CommonService;

public interface CursoService extends CommonService<Curso> {
	public Curso findCursoByAlumnoId(Long id);

}
