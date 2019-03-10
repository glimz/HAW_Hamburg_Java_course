/**
 * This class denotes a double linked note, holding a Title
 * 
 * @author Orsini, Posdorfer
 * @version 01/2018
 */
class LinkNode
{
    // the previous node in the chain
    private LinkNode _previous;

    // the following node in the chain
    private LinkNode _next;

    // the title of this node
    private Title _element;

    /**
     * Creates a new LinkNode without any information regarding previous/next nodes
     * or titles
     */
    public LinkNode()
    {
    }

    /**
     * Creates a new LinkNode and sets the predecessor, successor and title
     * 
     * @param element
     *            the title this node should hold
     * @param predecessor
     *            the previous node in the chain
     * @param successor
     *            the following node in the chain
     */
    public LinkNode(Title element, LinkNode predecessor, LinkNode successor)
    {
        _element = element;
        _previous = predecessor;
        _next = successor;
    }

    /**
     * returns the successor node
     * 
     * @return the next node in the chain
     */
    public LinkNode getNext()
    {
        return _next;
    }

    /**
     * Set the successor node
     * 
     * @param successor
     *            the next node in the chain
     */
    public void setNext(LinkNode successor)
    {
        _next = successor;
    }

    /**
     * returns the predecessor of this node
     * 
     * @return the previous node
     */
    public LinkNode getPrevious()
    {
        return _previous;
    }

    /**
     * Sets the predecessor node
     * 
     * @param predecessor
     *            the previous node in the chain
     */
    public void setPrevious(LinkNode predecessor)
    {
        _previous = predecessor;
    }

    /**
     * Returns the title stored in this node
     * 
     * @return the title stored in this node
     */
    public Title getTitle()
    {
        return _element;
    }

    /**
     * Set the element of this node
     * 
     * @param element
     *            title to be stored
     */
    public void setTitle(Title element)
    {
        _element = element;
    }

    /**
     * This method catches a typical error, which occurs when accidentally comparing
     * LinkedNodes with Titles
     */
    public boolean equals(Title title)
    {
        throw new IllegalArgumentException("ERROR: It does not make sense to compare LinkNodes to Titles");
    }
}
