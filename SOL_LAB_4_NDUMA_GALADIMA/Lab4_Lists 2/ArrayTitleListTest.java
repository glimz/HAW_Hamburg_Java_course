import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit-Test for the ArrayTitleList
 * 
 * @author Orsini, Posdorfer
 * @version 01/2018
 */
public class ArrayTitleListTest
{
    protected Title[] _testTitle;

    public ArrayTitleListTest()
    {
        TitleDatabase bibliothek = new TitleDatabase("JazzMix.txt");
        _testTitle = bibliothek.getRandomTitle(10);
    }

    /**
     * tests the contains method
     */
    @Test
    public void testContains()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }

        assertTrue("titleList should contain Test-Title 0", titleList.contains(_testTitle[0]));
        assertTrue("titleList should contain Test-Title 2", titleList.contains(_testTitle[2]));
        assertTrue("titleList should contain Test-Title 9", titleList.contains(_testTitle[9]));

        Title wrongTitle = new Title("", "", "", 0, "", 0);
        assertFalse("titleList must not containt Title 'wrongTitle'", titleList.contains(wrongTitle));
    }

    /**
     * Tests if the implementation compares Titles using equals
     */
    @Test
    public void testListUsesEqualsForComparision()
    {
        TitleList titleList = createList();
        Title titel = new Title("At Saturday", "Esbjoern Svensson Trio", "Winter in Venice", 1999, "Jazz", 374);
        Title sameTitle = new Title("At Saturday", "Esbjoern Svensson Trio", "Winter in Venice", 1999, "Jazz", 374);
        titleList.add(titel, 0);

        assertTrue("titleList must contain 'sameTitle'", titleList.contains(sameTitle));
    }

    /**
     * Tests the getLength() method of the list
     */
    @Test
    public void testGetLength()
    {
        TitleList titleList = createList();
        assertEquals(0, titleList.getLength());

        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
            assertEquals(i + 1, titleList.getLength());
        }

        assertEquals(10, titleList.getLength());
    }

    /**
     * tests the method add(title,int) with the list. it will especially be tested
     * whether items can be added in the middle.
     */
    @Test
    public void testAddingTitlesInMiddle()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 9; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        titleList.add(_testTitle[9], 5);
        assertEquals(10, titleList.getLength());
        assertTrue("titelList should containt Test-Title 9", titleList.contains(_testTitle[9]));
        assertEquals(_testTitle[9], titleList.getTitle(5));
        assertEquals(_testTitle[4], titleList.getTitle(4));
        assertEquals(_testTitle[5], titleList.getTitle(6));
        assertEquals(_testTitle[8], titleList.getTitle(9));
    }

    /**
     * tests the method add(title,int) with the list. it will especially be tested
     * wheter items can be added at the beginning
     */
    @Test
    public void testAddingTitlesAtBeginning()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 9; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        titleList.add(_testTitle[9], 0);
        assertEquals(10, titleList.getLength());
        assertTrue("titelList should containt Test-Title 9", titleList.contains(_testTitle[9]));
        assertEquals(_testTitle[9], titleList.getTitle(0));
        assertEquals(_testTitle[0], titleList.getTitle(1));
        assertEquals(_testTitle[8], titleList.getTitle(9));
    }

    /**
     * tests the method add(title,int) with the list. it will especially be tested
     * wheter items can be added at the end
     */
    @Test
    public void testeaddListenende()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        assertEquals(10, titleList.getLength());
        assertEquals(_testTitle[0], titleList.getTitle(0));
        assertEquals(_testTitle[9], titleList.getTitle(9));
    }

    /**
     * Tests that elements will be correctly shifted at the beginning
     */
    @Test
    public void testShiftingOfElements()
    {
        TitleList titleList = createList();
        titleList.add(_testTitle[6], 0);
        titleList.add(_testTitle[5], 0);
        titleList.delete(1);
        assertTrue("titleList soll den Test-Titel 5 enthalten", titleList.contains(_testTitle[5]));
    } 

    /**
     * tests the method add(title,int) with the list. escpecially if the list
     * behaves correctly when adding elements at invalid positions.
     */
    @Test
    public void testAddingInvalidPosition()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        boolean exception = false;
        Title wrongTitle = new Title("", "", "", 0, "", 0);
        try
        {
            titleList.add(wrongTitle, -1);
        } catch (IndexOutOfBoundsException ie)
        {
            exception = true;
        }
        assertTrue("there should have been an exception", exception);
        assertEquals(10, titleList.getLength());
        assertFalse("titleList must not contain 'wrongTitle'", titleList.contains(wrongTitle));
        assertEquals(_testTitle[0], titleList.getTitle(0));
        assertEquals(_testTitle[9], titleList.getTitle(9));

        exception = false;
        try
        {
            titleList.add(wrongTitle, 11);
        } catch (IndexOutOfBoundsException ie)
        {
            exception = true;
        }
        assertTrue("there should have been an exception", exception);
        assertEquals(10, titleList.getLength());
        assertFalse("titleList must not contain 'wrongTitle'", titleList.contains(wrongTitle));
        assertEquals(_testTitle[0], titleList.getTitle(0));
        assertEquals(_testTitle[9], titleList.getTitle(9));
    }

    /**
     * tests the method delete(int). it will be tested if items can be deleted from
     * the middle of the list.
     */
    @Test
    public void testDeletingTitlesInMiddle()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        titleList.delete(5);
        assertEquals(9, titleList.getLength());
        assertFalse("titleList must not contain title-5", titleList.contains(_testTitle[5]));
        assertEquals(_testTitle[4], titleList.getTitle(4));
        assertEquals(_testTitle[6], titleList.getTitle(5));
        assertEquals(_testTitle[9], titleList.getTitle(8));
    }

    /**
     * tests the method delete(int). it will be tested if items can be deleted from
     * the beginning of the list.
     */
    @Test
    public void testDeletingTitlesAtBeginning()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        titleList.delete(0);
        assertEquals(9, titleList.getLength());
        assertFalse("titleList must not contain title-0", titleList.contains(_testTitle[0]));
        assertEquals(_testTitle[1], titleList.getTitle(0));
        assertEquals(_testTitle[9], titleList.getTitle(8));
    }

    /**
     * tests the method delete(int). it will be tested if items can be deleted from
     * the end of the list.
     */
    @Test
    public void testDeletingTitlesAtEnd()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        titleList.delete(9);
        assertEquals(9, titleList.getLength());
        assertFalse("titleList must not contain title-9", titleList.contains(_testTitle[9]));
        assertEquals(_testTitle[0], titleList.getTitle(0));
        assertEquals(_testTitle[8], titleList.getTitle(8));
    }

    /**
     * tests the method delete(int). it will be testet if the list behaves correctly
     * when trying to delete items at invalid positions
     */
    @Test
    public void testDeletingAtInvalidPosition()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        boolean exception = false;
        try
        {
            titleList.delete(-1);
        } catch (IndexOutOfBoundsException ie)
        {
            exception = true;
        }
        assertTrue("there should have been an exception", exception);
        assertEquals(10, titleList.getLength());
        assertEquals(_testTitle[0], titleList.getTitle(0));
        assertEquals(_testTitle[9], titleList.getTitle(9));

        exception = false;
        try
        {
            titleList.delete(10);
        } catch (IndexOutOfBoundsException ie)
        {
            exception = true;
        }
        assertTrue("there should have been an exception", exception);
        assertEquals(10, titleList.getLength());
        assertEquals(_testTitle[0], titleList.getTitle(0));
        assertEquals(_testTitle[9], titleList.getTitle(9));
    }

    /**
     * tests the getTitle(int) method. testing if items can be retrieved from the
     * middle
     */
    @Test
    public void testGetTitleAtMiddle()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        assertEquals(_testTitle[5], titleList.getTitle(5));
        assertEquals(10, titleList.getLength());
        assertTrue("titleList should contain Test-Title 5", titleList.contains(_testTitle[5]));
    }

    /**
     * tests the getTitle(int) method. testing if items can be retrieved from the
     * beginning
     */
    @Test
    public void testGetTitleAtBeginning()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        assertEquals(_testTitle[0], titleList.getTitle(0));
        assertEquals(10, titleList.getLength());
        assertTrue("titleList should containt Test-Titel 0", titleList.contains(_testTitle[0]));
    }

    /**
     * tests the getTitle(int) method. testing if items can be retrieved from the
     * end
     */
    @Test
    public void testGetTitleAtEnd()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        assertEquals(_testTitle[9], titleList.getTitle(9));
        assertEquals(10, titleList.getLength());
        assertTrue("titleList should contain Test-Titel 9", titleList.contains(_testTitle[9]));
    }

    /**
     * tests the getTitle(int) method. testing if the list behaves correclty when
     * trying to retrieve elements from invalid positions
     */
    @Test
    public void testGetTitleAtInvalidPosition()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        boolean exception = false;
        try
        {
            titleList.getTitle(-1);
        } catch (IndexOutOfBoundsException ie)
        {
            exception = true;
        }
        assertTrue("there should have been an exception", exception);
        assertEquals(10, titleList.getLength());
        assertEquals(_testTitle[0], titleList.getTitle(0));
        assertEquals(_testTitle[9], titleList.getTitle(9));

        exception = false;
        try
        {
            titleList.getTitle(10);
        } catch (IndexOutOfBoundsException ie)
        {
            exception = true;
        }
        assertTrue("there should have been an exception", exception);
        assertEquals(10, titleList.getLength());
        assertEquals(_testTitle[0], titleList.getTitle(0));
        assertEquals(_testTitle[9], titleList.getTitle(9));
    }

    /**
     * test the clear() method
     */
    @Test
    public void testClear()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 10; i++)
        {
            titleList.add(_testTitle[i], titleList.getLength());
        }
        assertEquals(10, titleList.getLength());
        titleList.clear();
        assertEquals(0, titleList.getLength());
        assertFalse("titleList must not contain Test-Titel 0", titleList.contains(_testTitle[0]));
        assertFalse("titleList must not contain Test-Titel 0", titleList.contains(_testTitle[9]));
    }

    /**
     * Creates a new titleList
     */
    public TitleList createList()
    {
        return new ArrayTitleList();
    }
}
