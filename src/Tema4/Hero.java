package Tema4;

public class Hero {
    private String nombre;
    private int level, health, maxHealth, experience, attack, defense;

    public Hero(){
        this.nombre="Anya";
        this.level=0;
        this.health=0;
        this.maxHealth=0;
        this.experience=0;
        this.attack=0;
        this.defense=0;
    }
    public Hero(String nombre, int level, int health, int maxHealth, int experience, int attack, int defense){
        this.nombre=nombre;
        this.level=level;
        this.health=health;
        this.maxHealth=maxHealth;
        this.experience=experience;
        this.attack=attack;
        this.defense=defense;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if (nombre.length()>20 || nombre.length()<1){
            System.out.println("Tu nombre no es valido");
        }else {
            this.nombre=nombre;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level<1||level>10){
            System.out.println("Tu nivel no es correcto");
        }else {
            this.level = level;
        }

    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getExperience() {
        return experience;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}
