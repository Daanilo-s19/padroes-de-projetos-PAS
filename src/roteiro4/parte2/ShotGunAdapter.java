package roteiro4.parte2;

import roteiro4.armas.artilharia.ShotGun;

public class ShotGunAdapter extends ShotGun implements Arma {

    @Override
    public void carregar() {
        this.loadGun();
    }

    @Override
    public void atirar() {
        this.shotKill();
    }

    @Override
    public void mirar() {
        this.targetEnemy();
    }

}
