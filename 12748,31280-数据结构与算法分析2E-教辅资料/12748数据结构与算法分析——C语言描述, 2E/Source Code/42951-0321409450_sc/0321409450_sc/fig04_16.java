    private static class BinaryNode<AnyType>
    {
            // Constructors
        BinaryNode( AnyType theElement )
          { this( theElement, null, null ); }

        BinaryNode( AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt )
          { element  = theElement; left = lt; right = rt; }

        AnyType element;            // The data in the node
        BinaryNode<AnyType> left;   // Left child
        BinaryNode<AnyType> right;  // Right child
    }
