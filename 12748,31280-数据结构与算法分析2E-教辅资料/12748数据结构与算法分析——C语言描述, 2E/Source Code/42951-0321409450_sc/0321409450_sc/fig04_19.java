public class BinarySearchTree<AnyType>
{
    private BinaryNode<AnyType> root;
    private Comparator<? super AnyType> cmp;

    public BinarySearchTree( )
      { this( null ); }

    public BinarySearchTree( Comparator<? super AnyType> c )
      { root = null; cmp = c; }

    private int myCompare( AnyType lhs, AnyType rhs )
    {
        if( cmp != null )
            return cmp.compare( lhs, rhs );
        else
            return ((Comparable)lhs).compareTo( rhs );
    }

    private boolean contains( AnyType x, BinaryNode<AnyType> t )
    {
        if( t == null )
            return false;

        int compareResult = myCompare( x, t.element );

        if( compareResult < 0 )
            return contains( x, t.left );
        else if( compareResult > 0 )
            return contains( x, t.right );
        else
            return true;    // Match
    }

    // Remainder of class is similar with calls to compareTo replaced by myCompare
}
