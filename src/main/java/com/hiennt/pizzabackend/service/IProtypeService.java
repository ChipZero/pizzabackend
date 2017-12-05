package com.hiennt.pizzabackend.service;

import com.hiennt.pizzabackend.entity.Protype;

import java.util.List;

public interface IProtypeService {
    List<Protype> getAllProtype();
    Protype getPrtById (Integer proId);
    Protype addNewPrt (Protype protype);
    Protype updatePrt (Protype protype);
    Protype deletePrtById (Integer proId);
}
