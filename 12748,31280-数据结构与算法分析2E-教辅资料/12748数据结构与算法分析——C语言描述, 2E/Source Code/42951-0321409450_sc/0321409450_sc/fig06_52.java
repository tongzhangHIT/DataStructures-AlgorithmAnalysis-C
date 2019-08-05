public class BinomialQueue<AnyType extends Comparable<? super AnyType>>
{
    public BinomialQueue( )
      { /* See online code */ }
    public BinomialQueue( AnyType item ) 
      { /* See online code */ }

    public void merge( BinomialQueue<AnyType> rhs )
      { /* Figure 6.55 */ }
    public void insert( AnyType x )
      { merge( new BinomialQueue<AnyType>( x ) ); }
    public AnyType findMin( )
      { /* See online code */ }
    public AnyType deleteMin( )
      { /* Figure 6.56 */ }

    public boolean isEmpty( )
      { return currentSize == 0; }
    public void makeEmpty( )
      { /* See online code */ }

    private static class Node<AnyType>
    {
            // Constructors
        Node( AnyType theElement )
          { this( theElement, null, null ); }

        Node( AnyType theElement, Node<AnyType> lt, Node<AnyType> nt )
          { element = theElement; leftChild = lt;  nextSibling = nt; }

        AnyType       element;     // The data in the node
        Node<AnyType> leftChild;   // Left child
        Node<AnyType> nextSibling; // Right child
    }

    private static final int DEFAULT_TREES = 1;

    private int currentSize;             // # items in priority queue
    private Node<AnyType> [ ] theTrees;  // An array of tree roots

    private void expandTheTrees( int newNumTrees )
      { /* See online code */ }
    private Node<AnyType> combineTrees( Node<AnyType> t1, Node<AnyType> t2 )
      { /* Figure 6.54 */ }

    private int capacity( )
      { return ( 1 << theTrees.length ) - 1; }
    private int findMinIndex( )
      { /* See online code */ }
}
