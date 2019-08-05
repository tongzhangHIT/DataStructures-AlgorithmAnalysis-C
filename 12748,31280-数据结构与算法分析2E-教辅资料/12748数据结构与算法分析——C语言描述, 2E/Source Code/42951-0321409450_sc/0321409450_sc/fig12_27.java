public class AATree<AnyType extends Comparable<? super AnyType>>
{
    /**
     * Construct the tree.
     */
    public AATree( )
    {
        nullNode = new AANode<AnyType>( null, null, null );
        nullNode.left = nullNode.right = nullNode;
        nullNode.level = 0;
        root = nullNode;
    }

    private static class AANode<AnyType>
    {
            // Constructor
        AANode( AnyType theElement, AANode<AnyType> lt, AANode<AnyType> rt )
          { element = theElement; left = lt; right = rt; level = 1; }

        AnyType         element;      // The data in the node
        AANode<AnyType> left;         // Left child
        AANode<AnyType> right;        // Right child
        int             level;        // Level
    }
    
    private AANode<AnyType> root;
    private AANode<AnyType> nullNode;
}
