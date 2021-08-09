public class songs
{
    private String title ;
    private double duration ;
    public songs ()
    {
        new songs("none",0.0);
    }

    public songs(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }


    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.title+" : "+this.duration;
    }
}
