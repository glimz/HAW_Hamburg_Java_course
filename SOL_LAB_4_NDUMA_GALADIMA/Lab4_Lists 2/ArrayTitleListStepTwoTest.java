

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This Test-Class tests the functionality provided in Step#2 of the array implementation
 *
 * @author  Orsini, Posdorfer
 * @version 01/2018
 */
public class ArrayTitleListStepTwoTest extends ArrayTitleListTest
{
    /**
     * test if items can be removed from lists, which are larger than 10
     */
    @Test
    public void testDeletingFromLargeList()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 12; i++)
        {
            titleList.add(_testTitle[i % 10], titleList.getLength());
        }
        titleList.delete(0);
        titleList.delete(0);
        titleList.delete(0);
        assertEquals(9, titleList.getLength());
        assertEquals(_testTitle[3], titleList.getTitle(0));
    }
    
    /**
     * Tests if the list corretly enlarges when adding multiple elements
     */
    @Test
    public void testEnlargingList()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 100; i++)
        {
            titleList.add(_testTitle[i % 10], 0);
        }
        assertEquals(100, titleList.getLength());

        for (int i = 0; i < 100; i++)
        {
            assertEquals(_testTitle[i % 10], titleList.getTitle(99 - i));
        }
    }
    
      /**
     * Tests the 'growing' of lists, when adding alot of elements
     */
    @Test
    public void testGrowingOfList()
    {
        TitleList titleList = createList();
        for (int i = 0; i < 12; i++)
        {
            titleList.add(_testTitle[i % 10], 0);
        }
        assertEquals(12, titleList.getLength());

        assertEquals(_testTitle[0], titleList.getTitle(11));
        assertEquals(_testTitle[1], titleList.getTitle(10));
    }
}
