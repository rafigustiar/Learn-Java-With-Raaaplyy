package Modul4PBO.CodeLabModul4PBO.kendaraan.khusus;

import Modul4PBO.CodeLabModul4PBO.kendaraan.Kendaraan;
import Modul4PBO.CodeLabModul4PBO.kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    @Override
    public void Start() {
        System.out.println("Menyalakan pesawat " + this.getName());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan mesin pesawat " + this.getName());
    }


    //penambahan method Brake yang override dari parent class Kendaraan
    @Override
    public void Brake() {
        System.out.println("Pesawat berhenti");
    }

    @Override
    public void fly() {
        System.out.println("Pesawat " + this.getName() + " lepas landas");
    }
}