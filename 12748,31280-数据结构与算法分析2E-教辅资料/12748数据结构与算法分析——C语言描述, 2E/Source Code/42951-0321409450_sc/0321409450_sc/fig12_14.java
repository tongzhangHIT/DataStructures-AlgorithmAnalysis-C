public class RedBlackTree<AnyType extends Comparable<? super AnyType>>
{
    /**
     * Construct the tree.
     */
    public RedBlackTree( )
    {
        nullNode = new RedBlackNode<AnyType>( null );
        nullNode.left = nullNode.right = nullNode;
        header      = new RedBlackNode<AnyType>( null );
        header.left = header.right = nullNode;
    }

    private static class RedBlackNode<AnyType>
    {
            // Constructors
        RedBlackNode( AnyType theElement )
          { this( theElement, null, null ); }

        RedBlackNode( AnyType theElement, RedBlackNode<AnyType> lt, RedBlackNode<AnyType> rt )
          { element = theElement; left = lt; right = rt; color = RedBlackTree.BLACK; }

        AnyType               element;    // The data in the node
        RedBlackNode<AnyType> left;       // Left child
        RedBlackNode<AnyType> right;      // Right child
        int                   color;      // Color
    }
    
    private RedBlackNode<AnyType> header;
    private RedBlackNode<AnyType> nullNode;

    private static final int BLACK = 1;    // BLACK must be 1
    private static final int RED   = 0;
}
