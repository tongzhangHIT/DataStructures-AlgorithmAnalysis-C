    /**
     * Internal method that implements two-pass merging.
     * @param firstSibling the root of the conglomerate;
     *     assumed not null.
     */
    private PairNode<AnyType> combineSiblings( PairNode<AnyType> firstSibling )
    {
        if( firstSibling.nextSibling == null )
            return firstSibling;

            // Store the subtrees in an array
        int numSiblings = 0;
        for( ; firstSibling != null; numSiblings++ )
        {
            treeArray = doubleIfFull( treeArray, numSiblings );
            treeArray[ numSiblings ] = firstSibling;
            firstSibling.prev.nextSibling = null;  // break links
            firstSibling = firstSibling.nextSibling;
        }
        treeArray = doubleIfFull( treeArray, numSiblings );
        treeArray[ numSiblings ] = null;

            // Combine subtrees two at a time, going left to right
        int i = 0;
        for( ; i + 1 < numSiblings; i += 2 )
            treeArray[ i ] = compareAndLink( treeArray[ i ], treeArray[ i + 1 ] );

            // j has the result of last compareAndLink.
            // If an odd number of trees, get the last one.
        int j = i - 2;
        if( j == numSiblings - 3 )
            treeArray[ j ] = compareAndLink( treeArray[ j ], treeArray[ j + 2 ] );

            // Now go right to left, merging last tree with
            // next to last. The result becomes the new last.
        for( ; j >= 2; j -= 2 )
            treeArray[ j - 2 ] = compareAndLink( treeArray[ j - 2 ], treeArray[ j ] );

        return (PairNode<AnyType>) treeArray[ 0 ];
    }
    private PairNode<AnyType> [ ] 
    doubleIfFull( PairNode<AnyType> [ ] array, int index )
    {
        if( index == array.length )
        {
            PairNode<AnyType> [ ] oldArray = array;

            array = new PairNode[ index * 2 ];
            for( int i = 0; i < index; i++ )
                array[ i ] = oldArray[ i ];
        }
        return array;
    }
   
        // The tree array for combineSiblings
    private PairNode<AnyType> [ ] treeArray = new PairNode[ 5 ];
