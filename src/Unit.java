public class Unit {

    protected String name;
    protected String surname;
    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;
    public Unit(String name){
        Game.count0fUnits++;
        this.name = name;
    }


    protected float criticalChance = 0.1f;
    protected float parryChance = 0.1f;



    public void setHealth(int health){
        this.health = health;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public void setParryChance(float parryChance) {
        this.parryChance = parryChance;
    }

    public void attack(Unit unit){
        unit.getDamage(power);
    }
    public void getDamage(int damage){
        this.health=-damage;
    }


    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
    public void print(){
        System.out.println(this);
    }
    public void print(String str){
        System.out.println(str+" "+this);
    }
}
