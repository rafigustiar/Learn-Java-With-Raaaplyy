package Modul4PBO.CodeLabModul4PBO.kendaraan.pribadi;

import Modul4PBO.CodeLabModul4PBO.kendaraan.Kendaraan;

public class Motor extends Kendaraan {

    //penambahan method Start
    @Override
    public void Start() {
        System.out.println("Motor " + this.getName() + " " + this.getModel() + " " + this.getTahun() + " dinyalakan");
    }


    @Override
    public void Stop() {
        System.out.println("Motor " + this.getName() + " " + this.getModel() + " " + this.getTahun() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}