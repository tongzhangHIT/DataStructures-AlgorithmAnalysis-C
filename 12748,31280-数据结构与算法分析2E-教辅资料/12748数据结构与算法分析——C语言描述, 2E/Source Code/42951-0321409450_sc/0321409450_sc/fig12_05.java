public class SplayTree<AnyType extends Comparable<? super AnyType>>
{
    public SplayTree( )
    {
        nullNode = new BinaryNode<AnyType>( null );
        nullNode.left = nullNode.right = nullNode;
        root = nullNode;
    }

    private BinaryNode<AnyType> splay( AnyType x, BinaryNode<AnyType> t )
      { /* Figure 12.6 */ }
    public void insert( AnyType x )
      { /* Figure 12.7 */ }
    public void remove( AnyType x )
      { /* Figure 12.8 */ }
      
    public AnyType findMin( )
      { /* See online code */ }
    public AnyType findMax( )
      { /* See online code */ }
    public boolean contains( AnyType x )
      { /* See online code */ }
    public void makeEmpty( )
      { root = nullNode; }
    public boolean isEmpty( )
      { return root == nullNode; }
      
    // Basic node stored in unbalanced binary search trees
    private static class BinaryNode<AnyType>
      { /* Same as in Figure 4.16 */ }

    private BinaryNode<AnyType> root;
    private BinaryNode<AnyType> nullNode;
    private BinaryNode<AnyType> header = new BinaryNode<AnyType>( null ); // For splay
    private BinaryNode<AnyType> newNode = null;  // Used between different inserts

    private BinaryNode<AnyType> rotateWithLeftChild( BinaryNode<AnyType> k2 )
      { /* See online code */ }
    private BinaryNode<AnyType> rotateWithRightChild( BinaryNode<AnyType> k1 )
      { /* See online code */ }
}
