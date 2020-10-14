package com.example.alumno.services;

import com.example.alumno.entities.Alumno;
import com.example.alumno.repositories.AlumnoRepository;
import com.example.alumno.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl extends BaseServiceImpl<Alumno,Long> implements AlumnoService {


    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(BaseRepository<Alumno,Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Alumno> search(String filtro) throws Exception {
        try{
            return null;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
