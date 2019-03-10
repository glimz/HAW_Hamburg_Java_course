import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * this class implements a simple database of titles.
 * 
 * @author Orsini, Posdorfer
 * @version 01/2018
 */
class TitleDatabase
{
    private ArrayList<Title> _titleList;

    /**
     * Initializes a database from a given file
     * 
     * @param databaseFile
     *            filename of the database
     */
    public TitleDatabase(String databaseFile)
    {
        _titleList = new ArrayList<Title>();
        read(databaseFile);
    }

    /**
     * Initializes a database from the JazzMix.txt
     */
    public TitleDatabase()
    {
        this("JazzMix.txt");
    }

    /**
     * returns a number of random titles from the list.
     * 
     * @param count
     *            how many items
     */
    public Title[] getRandomTitle(int count)
    {
        Collections.shuffle(_titleList);
        return _titleList.subList(0, count).toArray(new Title[count]);
    }

    /**
     * Writes every item to the console
     */
    public void printToConsole()
    {
        for (Title titel : _titleList)
        {
            System.out.println(titel);
        }
    }

    /**
     * Reads every Title from the file, line by line
     * 
     * @param fileName
     *            filename of the txt-file
     */
    private void read(String fileName)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String zeile;
            while ((zeile = reader.readLine()) != null)
            {
                handleLine(zeile);
            }
        } catch (IOException ex)
        {
            System.out.println(ex);
        }
    }

    private void handleLine(String line)
    {
        String[] column = line.split("\t");

        String name = column[0];
        String artist = column[1];
        String album = column[2];
        String year = column[6];
        String genre = column[3];
        String duration = column[4];

        Title titel = new Title(name, artist, album, Integer.parseInt(year), genre, Integer.parseInt(duration));
        _titleList.add(titel);
    }
}
