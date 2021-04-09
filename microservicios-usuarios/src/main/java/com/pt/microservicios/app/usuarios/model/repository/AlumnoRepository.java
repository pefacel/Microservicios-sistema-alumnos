package com.pt.microservicios.app.usuarios.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.pt.microservicios.commons.alumnos.models.Alumno;

public interface AlumnoRepository extends PagingAndSortingRepository<Alumno, Long> {

@Query("select a from Alumno a where a.nombre like %?1% or a.apellido like %?1%")
public List<Alumno> findByNombreOrApellido(String term);
}
