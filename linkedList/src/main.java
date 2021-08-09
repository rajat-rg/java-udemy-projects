import java.util.*;

public class main {
    private static ArrayList<album> albums = new ArrayList<album>();
    public static void main(String[] args)
    {

        album albm = new album("LOVER <3", "Taylor Swift");
        albm.addSong("Lover", 3.5);
        albm.addSong("i forgot that you existed", 4.0);
        albm.addSong("paper rings", 4.5);
        albm.addSong("The man", 3.75);
        albm.addSong("ME!", 4.6);
        albums.add(albm);

        album album1 = new album("My world 2.0", "JB");
        album1.addSong("Baby", 3.35);
        album1.addSong("Somebody to love", 4.0);
        album1.addSong("Stuck in the moment", 4.56);
        album1.addSong("U smile", 3.6);
        albums.add(album1);


        LinkedList<songs> playlist = new LinkedList<songs>();

        albums.get(0).addToPlaylist("Lover", playlist);
        albums.get(1).addToPlaylist("U smile", playlist);
        albums.get(0).addToPlaylist("The man", playlist);
        albums.get(0).addToPlaylist("Aas paas khuda", playlist);
        albums.get(0).addToPlaylist(5, playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(2, playlist);

        System.out.println(playlist.get(0));
        System.out.println(playlist.get(1));
        System.out.println(playlist.get(2));
        System.out.println(playlist.get(3));
        System.out.println(playlist.get(4));
        System.out.println(playlist.get(5));

        System.out.println(album1.song);
        play(playlist);

    }



    private static void printMenu()
    {
        System.out.println("Available actions \n press" +
                "0 -- Quit\n" +
                "1 -- to play next song\n" +
                "2 -- to play previous song\n" +
                "3 --  to replay current song\n " +
                "4 -- list songs in playList\n" +
                "5 -- print menu list " );
    }
    private static void printlist (LinkedList <songs> playList)
    {
        Iterator<songs> i = playList.iterator();
        System.out.println("*--------------------------------*");
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("*--------------------------------*");

    }

    private static void play(LinkedList<songs> playlist)
    {
        ListIterator<songs> i = playlist.listIterator();
        boolean quit = false, forward = true;
        if(playlist.size()==0)
        {
            System.out.println("Playlist is empty");
            return ;
        }
        else
        {
            System.out.println("now playing "+ i.next().toString());
        }
        Scanner scan = new Scanner(System.in);




        printMenu();
        while (!quit) {
            int a = scan.nextInt();
            switch (a) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (i.hasNext()) {
                            i.next();
                        }
                        forward = true;
                    }
                    if (i.hasNext()) {
                        System.out.println("Now playing : "+i.next().toString());
                    }
                    else
                    {
                        System.out.println("This is the last song");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (i.hasPrevious()) {
                            i.previous();
                        }
                        forward = false;
                    }
                    if (i.hasPrevious()) {
                        System.out.println("Now playing : "+i.previous());

                    }
                    else
                        {
                        System.out.println("This is first song");
                        forward = true;
                        break;
                        }
                    break;
                case 3 :
                    if (forward)
                    {
                        if(i.hasPrevious())
                        {
                            System.out.println("Now replaying : "+i.previous().toString());
                        }
                        else
                        {
                            System.out.println("We are at start of list");
                            break;
                        }
                    }
                    else
                    {
                        if(i.hasNext())
                        {
                            System.out.println("Now playing "+i.next().toString());
                            forward= true ;
                        }
                        else
                        {
                            System.out.println("We have reached end of list");
                            break;
                        }

                    }
                    break;
                case 4 :
                    printlist(playlist);
                    break ;
                case 5 :
                    printMenu();
                    break;
            }


        }
    }
}