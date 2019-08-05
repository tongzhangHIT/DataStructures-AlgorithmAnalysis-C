public class PairingHeap<AnyType extends Comparable<? super AnyType>>
{    
    /**
     * The Position interface represents a type that can
     * be used for the decreaseKey operation.
     */
    public interface Position<AnyType>
    {
        AnyType getValue( );
    }
    
    private static class PairNode<AnyType> implements Position<AnyType> 
    {
        public PairNode( AnyType theElement )
          { element = theElement; leftChild = nextSibling = prev = null; }

        public AnyType getValue( )
          { return element; }
        
        public AnyType             element;
        public PairNode<AnyType>   leftChild;
        public PairNode<AnyType>   nextSibling;
        public PairNode<AnyType>   prev;
    }
    
    private PairNode<AnyType> root;
    private int theSize;
    
    // Rest of class follows
}
