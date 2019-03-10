/**
 * 
 * The Class Title describes a music-title from a database. A title has a name,
 * artist, belongs to an album, from a certain year and is assigned a genre.
 * 
 * @author Orsini, Posdorfer
 * @version 01/2018
 */
class Title
{
    private String _name;
    private String _artist;
    private String _album;
    private int _year;
    private String _genre;
    private int _duration; // duration of title in seconds

    /**
     * Constructor for title objects
     */
    public Title(String name, String artist, String album, int year, String genre, int duration)
    {
        _name = name;
        _artist = artist;
        _album = album;
        _year = year;
        _genre = genre;
        _duration = duration;
    }

    /**
     * @return the name of the title
     */
    public String getTitleName()
    {
        return _name;
    }

    /**
     * @return the artist of this title
     */
    public String getArtist()
    {
        return _artist;
    }

    /**
     * @return the album of this title
     */
    public String getAlbum()
    {
        return _album;
    }

    /**
     * @return the length of this title in seconds
     */
    public int getDuration()
    {
        return _duration;
    }
    
    /**
     * Two titles are equal when all of the following traits are equal:
     * name, artist, album, year, genre and duration
     */
    public boolean equals(Object object)
    {
        boolean result = false;
        if (object instanceof Title)
        {
            Title titel = (Title) object;
            result = (_name.equals(titel._name) && 
                    _artist.equals(titel._artist) &&
                    _album.equals(titel._album) &&
                    _year == titel._year && 
                    _genre.equals(titel._genre) &&
                    _duration == titel._duration);
        }
        return result;
    }
    
    /**
     * hashCode of this title
     */
    public int hashCode()
    {
        return toString().hashCode();
    }

    public String toString()
    {
        return _artist + ": " + _name + " (" + _album + ", " + _year + ")";
    }
}
