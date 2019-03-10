/**
 * This class implements a TitleList using growing arrays.
 * 
 * @author Orsini, Posdorfer
 * @version 01/2018
 */
class ArrayTitleList implements TitleList
{
    /**
     * This array stores the references to the containing Titles. The length of the
     * array is also the capacity.
     */
    private Title[] _titleArray;

    /**
     * The elements of this list
     */
    private int _elementCount;

    /**
     * The starting capacity of every ArrayTitleList
     */
    private static final int BEGIN_CAPACITY = 10;

    /**
     * Intializes a new <code>ArrayTitleList</code>.
     */
    public ArrayTitleList()
    {
        _titleArray = new Title[BEGIN_CAPACITY];
        _elementCount = 0;
    }

    public void add(Title title, int position)
    {
        canNotBeNull(title);
    	needValidAddPosition(position);
        
        // TODO add an element to the given position
        if(position == _elementCount){
        	_titleArray[_elementCount++] = title;        	
        }
        else {
        	for(int i = getLength() - 1; i >= position; i--)
        		_titleArray[i+1] = _titleArray[i]; 
        	_titleArray[position] = title;
        	_elementCount+=1;
        }
        
        if ((_elementCount % BEGIN_CAPACITY == 0 ) && _elementCount > 0){
        	Title[] _temp =  new Title[_elementCount * 2];
        	for(int i = 0; i < _elementCount;i++)
        		_temp[i] = _titleArray[i];
        	_titleArray = _temp;
        }
    }

    public boolean contains(Title title)
    {
        canNotBeNull(title);

        // TODO check if this element is in the list
        /**Doing...*/
        if(_elementCount > 0) 
        {	
	        for(int i = 0; i < _elementCount; i++){
	        	if(_titleArray[i].equals(title))
	        		return true;
	        }
        }
        return false;
    }

    public Title getTitle(int position)
    {
        needValidPosition(position);
        return _titleArray[position];
    }

    public void delete(int position)
    {
        needValidPosition(position);

        // TODO remove the item at the given position
        if(position == _elementCount - 1){
        	_elementCount -= 1;
        } else {
        	for(int i = position; i < _elementCount; i++)
        		_titleArray[i] = _titleArray[i+1]; 
        	_elementCount -= 1;
        }
    }

    public int getLength()
    {
        return _elementCount;
    }

    public void clear()
    {
        // TODO remove all elements
    	_elementCount = 0;
    }

    /**
     * writes this list to the console, meant as a debugging-help
     */
    public void printToConsole()
    {
        System.out.println(java.util.Arrays.toString(_titleArray));
    }

    /**
     * Returns <code>true</code> for every valid position within this list.<br>
     * [0, length[
     */
    public boolean isValidPosition(int position)
    {
        return (position >= 0) && (position < getLength());
    }

    /**
     * throws an IndexOutOfBoundsException, if the position is invalid
     */
    private void needValidPosition(int position)
    {
        if (!isValidPosition(position))
        {
            throw new IndexOutOfBoundsException(position + " is an invalid position");
        }
    }

    /**
     * Returns <code>true</code> for every position, which an element can be added
     * to.<br>
     * [0, length+1[
     */
    public boolean isValidAddPosition(int position)
    {
        return (position >= 0) && (position <= getLength());
    }

    /**
     * throws an IndexOutOfBoundsException if this position is not a valid position
     * at which an item can be added.
     */
    private void needValidAddPosition(int position)
    {
        if (!isValidAddPosition(position))
        {
            throw new IndexOutOfBoundsException(position + " is not a valid position for adding elements");
        }
    }

    /**
     * throws an IllegalArgumentException if the Title is <code>null</code>
     */
    private void canNotBeNull(Title title)
    {
        if (title == null)
        {
            throw new IllegalArgumentException("The Title can not be null");
        }
    }
}
