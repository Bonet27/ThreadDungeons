package server;

public class Jugador {
    protected boolean isAlive = true;
    protected float HP = 100f%.2f;
    protected float DMG = 100f%.2f;
    protected float SPEED = 100f%.2f;
    protected float DEF = 100f%.2f;

    public Jugador(float HP, float DMG, float SPEED, float DEF) {
        this.HP = HP;
        this.DMG = DMG;
        this.SPEED = SPEED;
        this.DEF = DEF;
    }

    @Override
    public String toString() {
        return "STATS [" + "HP: " + HP + " DMG: " + DMG + " SPEED: " + SPEED + " DEF: " + DEF + "]";
    }
}
