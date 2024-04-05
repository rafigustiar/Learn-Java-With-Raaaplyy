
package Modul4PBO.CodeLabModul4PBO.kendaraan.khusus;

import Modul4PBO.CodeLabModul4PBO.kendaraan.Kendaraan;
import Modul4PBO.CodeLabModul4PBO.kendaraan.util.ShootAble;

//ShootAb -> ShootAble
public class Tank extends Kendaraan implements ShootAble {
    @Override
    public void Start() {
        System.out.println("Menyalakan tank " + this.getName() + " " + this.getModel());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan tank " + this.getName() + " " + this.getModel());
    }

    @Override
    public void Brake() {
        System.out.println("Tank berhenti");
    }

    @Override
    public void Shoot(String vehicle) {
        System.out.println("Tank menembak " + vehicle);
    }
}
