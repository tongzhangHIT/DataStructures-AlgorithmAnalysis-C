public class LeftistHeap<AnyType extends Comparable<? super AnyType>>
{
    public LeftistHeap( )
      { root = null; }

    public void merge( LeftistHeap<AnyType> rhs )
      { /* Figure 6.26 */ }
    public void insert( AnyType x )
      { /* Figure 6.29 */ }
    public AnyType findMin( )
      { /* See online code */ }
    public AnyType deleteMin( )
      { /* Figure 6.30 */ }

    public boolean isEmpty( )
      { return root == null; }
    public void makeEmpty( )
      { root = null; }

    private static class Node<AnyType>
    {
            // Constructors
        Node( AnyType theElement )
          { this( theElement, null, null ); }

        Node( AnyType theElement, Node<AnyType> lt, Node<AnyType> rt )
          { element = theElement; left = lt; right = rt; npl = 0; }

        AnyType       element;      // The data in the node
        Node<AnyType> left;         // Left child
        Node<AnyType> right;        // Right child
        int           npl;          // null path length
    }
    
    private Node<AnyType> root;    // root

    private Node<AnyType> merge( Node<AnyType> h1, Node<AnyType> h2 )
      { /* Figure 6.26 */ }
    private Node<AnyType> merge1( Node<AnyType> h1, Node<AnyType> h2 )
      { /* Figure 6.27 */ }
    private void swapChildren( Node<AnyType> t )
      { /* See online code */ }
}
