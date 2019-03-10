/**
 * An Interface for Title-Lists. 
 * A TitleList contains a set of music titles in a user specified order
 * <br>
 * Because the order of the titles is extremely important, there needs to be index-based
 * operations on every Title-List. Duplicates are allowed.
 * You might want to have the same title twice
 * 
 * @author Orsini, Posdorfer
 * @version 01/2018
 */
interface TitleList
{
    /**
     * Adds a Title at the position <code>position</code> in this TitleList.
     * Every following entry will be pushed back by one index position.
     * If <code>position</code> equals the size of the list, add it to the end
     * 
     * @param titel
     *              A title
     * @param position
     *              desired position of this title. Valid indexes are from 0 to getLength()-1.
     */
    public void add(Title titel, int position);

    /**
     * Removes the title at the given position. Every entry following the deleted entry will move one index up.
     * 
     * @param position
     *              A position in this list. Valid indexes are from 0 to getLength()-1.
     */
    public void delete(int position);

    /**
     * Check to see of a Title is already in this list.
     * 
     * @param titel
     *            A title.
     * @return returns <code>true</code> if this title is in the list,
     *         else <code>false</code>.
     */
    public boolean contains(Title titel);

    /**
     * returns the title at the given position
     * 
     * @param position
     *              the position of the title.
     *              valid indexes are from 0 to getLength()-1.
     * @return returns the title at <code>position</code>.
     */
    public Title getTitle(int position);

    /**
     * Returns the number of elements in this list.
     * 
     * @return Number of elements in this list.
     */
    public int getLength();

    /**
     * Removes all elements from this list.
     */
    public void clear();
}
