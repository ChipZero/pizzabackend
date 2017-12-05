package com.hiennt.pizzabackend.controller;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.hiennt.pizzabackend.entity.Protype;
import com.hiennt.pizzabackend.service.IProtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api")
public class protypeController {
    @Autowired
    private IProtypeService protypeService;

    private static final Logger logger = LoggerFactory.getLogger(protypeController.class);

    @GetMapping("protype/all")
    public List<Protype> getAll(){
        List<Protype> protypes = protypeService.getAllProtype();
        return protypes;
    }

    @GetMapping("protype/{id}")
    public Protype getById (@PathVariable("id") Integer prtId){
        return protypeService.getPrtById(prtId);
    }

    @PostMapping("protype/add")
    public String addNew (@RequestBody Protype protype){
        JSONObject result = new JSONObject();
        try {
            protypeService.addNewPrt(protype);
            result.put("code", "200");
            return result.toString();
        }catch (Exception e){
            e.printStackTrace();
            result.put("code", "999");
            return result.toString();
        }
    }

    @PutMapping("protype/update")
    public String update (@RequestBody Protype protype){
        JSONObject result = new JSONObject();
        try {
            protypeService.updatePrt(protype);
            result.put("code", "200");
            return result.toString();
        }catch (Exception e){
            e.printStackTrace();
            result.put("code", "999");
            return result.toString();
        }
    }

    @DeleteMapping("protype/{id}")
    public Protype delete(@PathVariable("id") Integer prtId){
        return protypeService.deletePrtById(prtId);
    }
}
