/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoSpring.servicio;

import CursoSpring.dao.IndividuoDao;
import CursoSpring.domain.Individuo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Esteban
 */
@Service
public class IndividuoServicioImp implements IndividuoServicio {

    @Autowired
    private IndividuoDao indiDao;

    @Override
    @Transactional (readOnly = true)
    public List<Individuo> listarIndividuos() {

        return (List<Individuo>) indiDao.findAll();
    }

    @Override
    @Transactional
    public void salvar(Individuo indi) {

        indiDao.save(indi);
    }

    @Override
    @Transactional
    public void borar(Individuo indi) {

        indiDao.delete(indi);
    }

    @Override
    @Transactional(readOnly = true)
    public Individuo buscarIndividuo(Individuo indi) {

        return indiDao.findById(indi.getId_individuo()).orElse(null);
    }

}//final
