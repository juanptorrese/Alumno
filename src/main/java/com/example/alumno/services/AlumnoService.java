package com.example.alumno.services;

import com.example.alumno.entities.Alumno;

import java.util.List;

public interface AlumnoService extends BaseService<Alumno, Long> {

    List<Alumno> search(String filtro) throws Exception;


}
