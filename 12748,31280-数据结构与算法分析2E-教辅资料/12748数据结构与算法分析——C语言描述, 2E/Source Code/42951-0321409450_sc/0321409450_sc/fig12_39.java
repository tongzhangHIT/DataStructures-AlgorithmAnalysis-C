    private static class TreapNode<AnyType>
    {
            // Constructors
        TreapNode( AnyType theElement )
          { this( theElement, null, null ); }
        TreapNode( AnyType theElement, TreapNode<AnyType> lt, TreapNode<AnyType> rt )
          { element = theElement; left = lt; right = rt; priority = randomObj.randomInt( ); }

        AnyType            element;      // The data in the node
        TreapNode<AnyType> left;         // Left child
        TreapNode<AnyType> right;        // Right child
        int                priority;     // Priority

        private static Random randomObj = new Random( );
    }
