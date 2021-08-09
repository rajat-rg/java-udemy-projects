import java.util.ArrayList;
import java.util.LinkedList;

public class album {
    private String name , artist ;
    ArrayList<songs> song ;


    private songs findSong (String title)
    {
        for(songs check :this.song)
        {
            if(check.getTitle().equals(title))
            {
                return check ;
            }
        }
        return null;

    }


    public album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.song  = new ArrayList<songs>();
    }

    public void addSong(String title , double duration)
    {

        if(findSong(title)==null)
        {

            this.song.add(new songs(title,duration));

        }
        else
        {
            System.out.println(title + " song is already in album");

        }


    }

    public void addToPlaylist (int track , LinkedList<songs> playlist)
    {
        int index = track - 1;

        if ((index >= 0 ) && (index <=this.song.size()))
        {
            playlist.add(this.song.get(index));

        }
        System.out.println("This album doesn't have track number "+track);

    }
    public void addToPlaylist(String title, LinkedList<songs> playlist)
    {
        songs check = findSong(title );
        if( check != null)
        {
            playlist.add(check);

        }
        System.out.println(title +" song isn't in album");

    }


}
