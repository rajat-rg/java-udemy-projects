import java.util.ArrayList;
import java.util.List;

public class player implements  ISaveable {
    private String name ;
    private int hitpoints , heath ;
    private String weapon = "M416";

    public player(String name, int hitpoints, int heath) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.heath = heath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        this.heath = heath;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "player{" +
                "name='" + name + '\'' +
                ", hit points=" + hitpoints +
                ", heath=" + heath +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();

        values.add(0,this.name);
        values.add(1,""+this.hitpoints);
        values.add(2,""+(this.heath));
        values.add(3,weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if(savedValues != null && savedValues.size() >0)
        {
            this.name = savedValues.get(0);
            this.hitpoints = Integer.parseInt(savedValues.get(1));
            this.heath = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }


    }
}
