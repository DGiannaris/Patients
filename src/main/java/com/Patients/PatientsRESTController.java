package com.Patients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
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

    @RequestMapping(value="/{AMKA}",method = RequestMethod.DELETE)
    public void delPatientbyAMKA(@PathVariable("AMKA") int AMKA)
    {
        getallPatientsCont.delPatientbyAMKA(AMKA);

    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePatient(@RequestBody Patient patient)
    {
        getallPatientsCont.updatePatient(patient);

    }


}
