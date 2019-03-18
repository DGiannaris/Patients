package com.Patients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/patients")
public class PatientsRESTController {
    @Autowired
    private PatientDao getallPatientsCont;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Patient> getallPatients()
    {
        return getallPatientsCont.getAllPatients();
    }

    @RequestMapping(value="/{AMKA}",method = RequestMethod.GET)
    public Patient getPatientbyAMKA(@PathVariable("AMKA") int AMKA)
    {
        return getallPatientsCont.getPatientbyAMKA(AMKA);
    }
}
