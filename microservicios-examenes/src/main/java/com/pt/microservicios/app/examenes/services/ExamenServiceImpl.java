package com.pt.microservicios.app.examenes.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pt.microservicios.app.examenes.models.entity.Examen;
import com.pt.microservicios.app.examenes.models.repository.ExamenRepository;
import com.pt.microservicios.commons.services.CommonServiceImpl;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen,ExamenRepository> implements ExamenService {

	

}
