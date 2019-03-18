package com.Patients;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PatientDao {

    public static Map<Integer, Patient> patients;

    static {

        patients = new HashMap<Integer, Patient>() {
            {
                put(1, new Patient(1, "Mpampis", "Aimorohdes", "Panormou 2", "7437834873", "Antwnhs", 212121));
                put(2, new Patient(2, "Antwnia", "Katarakths", "Katexakh 89", "0908908911", "Shfhs", 545454));
                put(3, new Patient(3, "Litsa", "Trixoptwsh", "Alexandras 43", "1232332233", "Antwnhs", 898989));

            }

        };

    }

    public Collection<Patient> getAllPatients()
    {
        return this.patients.values() ;
    }

    public Patient getPatientbyAMKA(int AMKA)
    {
        int tempkey=0;

        for (Map.Entry<Integer,Patient> entry : patients.entrySet()) {

            if (entry.getValue().getAMKA()== AMKA) {
                tempkey=entry.getKey();

            }
        }
        return this.patients.get(tempkey);
    }

}
