package com.hiennt.pizzabackend.service;

import com.hiennt.pizzabackend.entity.Protype;
import com.hiennt.pizzabackend.repository.IProtypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProtypeService implements IProtypeService{
    @Autowired
    private IProtypeRepository protypeRepository;

    @Override
    public List<Protype> getAllProtype() {
        return protypeRepository.findAll();
    }

    @Override
    public Protype getPrtById(Integer proId) {
        return protypeRepository.findOne(proId);
    }

    @Override
    public Protype addNewPrt(Protype protype) {
        return protypeRepository.save(protype);
    }

    @Override
    public Protype updatePrt(Protype protype) {
        return protypeRepository.save(protype);
    }

    @Override
    public Protype deletePrtById(Integer proId) {
        Protype protype = protypeRepository.findOne(proId);
        protypeRepository.delete(proId);
        return protype;
    }
}
