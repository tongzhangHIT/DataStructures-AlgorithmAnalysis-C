public class DSL<AnyType extends Comparable<? super AnyType>>
{
    /**
     * Construct the DSL.
     * @param inf the largest Comparable.
     */
    public DSL( AnyType inf )
    {
        infinity = inf;
        bottom = new SkipNode<AnyType>( null );
        bottom.right = bottom.down = bottom;
        tail   = new SkipNode<AnyType>( infinity );
        tail.right = tail;
        header = new SkipNode<AnyType>( infinity, tail, bottom );
    }

    private static class SkipNode<AnyType>
    {
            // Constructors
        SkipNode( AnyType theElement )
          { this( theElement, null, null ); }

        SkipNode( AnyType theElement, SkipNode<AnyType> rt, SkipNode<AnyType> dt )
          {  element = theElement; right = rt; down = dt; }

        AnyType           element;  // The data in the node
        SkipNode<AnyType> right;    // Right link 
        SkipNode<AnyType> down;     // Down link
    }
    
    private AnyType infinity;
    
    private SkipNode<AnyType> header;
    private SkipNode<AnyType> bottom = null;
    private SkipNode<AnyType> tail   = null;
}
