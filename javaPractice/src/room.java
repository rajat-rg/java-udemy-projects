public class room {
    private furniture chair , bed ;
    private appliances fan , light;

    public room(furniture chair, furniture bed, appliances fan, appliances light) {
        this.chair = chair;
        this.bed = bed;
        this.fan = fan;
        this.light = light;
    }
    public void showoff()
    {
        chair.show();
        bed.use();
        fan.show();
        light.show();

    }
    public void turnON()
    {
        fan.turnON();
        light.turnON();
    }
    public void turnOFF()
    {
        fan.turnOFF();
        light.turnOFF();
    }


    public appliances getFan() {
        return fan;
    }
}
