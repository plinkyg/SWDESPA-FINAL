package udc.objects.time.concrete;

import udc.objects.enums.UnavailabilityType;

import java.util.ArrayList;

public class Unavailable extends Agenda {

    private ArrayList<Agenda> exceptions;
    private UnavailabilityType unavailabilityType;
    private String doctorName;

    public UnavailabilityType getUnavailabilityType() {
        return unavailabilityType;
    }

    public void setUnavailabilityType(UnavailabilityType unavailabilityType) {
        this.unavailabilityType = unavailabilityType;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setExceptions(ArrayList<Agenda> exceptions) {
        this.exceptions = exceptions;
    }

    public ArrayList<Agenda> getExceptions() {
        return exceptions;
    }
}
