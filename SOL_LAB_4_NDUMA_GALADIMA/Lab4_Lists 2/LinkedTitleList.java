
import java.util.LinkedList;
import java.util.Iterator;

/**
 * This class implements the TitleList using a double-linked-list.
 * 
 * @author Orsini, Posdorfer
 * @version 01/2018
 */
class LinkedTitleList implements TitleList
{
    /**
     * the beginning of the linked-list
     */
    private LinkNode _listBegin;

    /**
     * the end of the linked-list
     */
    private LinkNode _listEnd;

    /**
     * the amount of elements in this list
     */
    private int _elementCount;

    /**
     * Initializes a new <code>LinkedTitleList</code>
     */
    public LinkedTitleList()
    {
        // this implementation uses two 'watcher'-nodes, one for the beginning and one
        // for the end
        // they are not actually a part of this list, but technically mark the beginning
        // and end of it
        // they allow us to add/delete entries more easily
        _listBegin = new LinkNode();
        _listEnd = new LinkNode();
        _listBegin.setNext(_listEnd);
        _listEnd.setPrevious(_listBegin);
        _elementCount = 0;
    }

    public void add(Title title, int position)
    {
        canNotBeNull(title);
        needValidAddPosition(position);
        // TODO add an element at the start of a list
        int count = 0;
        LinkNode current = _listBegin;
        while(count <= position){
        	current = current.getNext();
        	count++;
        }
        LinkNode newNode = new LinkNode(title, current.getPrevious(), current);
        current.setPrevious(newNode);
        newNode.getPrevious().setNext(newNode);
        _elementCount++;
    }      

    public boolean contains(Title title)
    {
        canNotBeNull(title);
        // TODO check if this element is in the list    
        for ( int count = 0; count < _elementCount; count++){
        if (getNode(count).getTitle().equals(title)){
            return true;            
        }       
    }
     return false;
}

    private LinkNode getNode(int position)
    {
        needValidPosition(position);
         LinkNode result = _listBegin;

        // TODO retrieve the node at the given position
        int count = 0;
        while(count <= position){
        	result = result.getNext();
        	count++;       
}
return result;
}

    public Title getTitle(int position)
    {
        needValidPosition(position);
        return getNode(position).getTitle();
    }

    public void delete(int position)
    {
        needValidPosition(position);

        // TODO remove the item at the given position
        int count = 0;
        LinkNode currentNode = _listBegin;
        while(count <= position){
        	currentNode = currentNode.getNext();
        	count++;
        }
        currentNode.getPrevious().setNext(currentNode.getNext());
        currentNode.getNext().setPrevious(currentNode.getPrevious());
        currentNode.setNext(null);
        currentNode.setPrevious(null);
        _elementCount -= 1;
    }
    public int getLength()
    {
        return _elementCount;
    }

    public void clear()
    {
        // TODO remove all element
        _listBegin.setNext(_listEnd);
    	_listEnd.setPrevious(_listBegin);
    	_elementCount = 0;
        
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
