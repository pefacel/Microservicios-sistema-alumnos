package com.pt.microservicios.app.respuestas.models.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.pt.microservicios.commons.alumnos.models.Alumno;
import com.pt.microservicios.commons.examenes.models.entity.Pregunta;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="respuestas")
public class Respuesta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String texto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Alumno alumno;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Pregunta pregunta;
	
	
}
