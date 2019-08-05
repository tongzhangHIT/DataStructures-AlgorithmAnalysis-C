    /**
     * Return the result of merging equal-sized t1 and t2.
     */
    private Node<AnyType> combineTrees( Node<AnyType> t1, Node<AnyType> t2 )
    {
        if( t1.element.compareTo( t2.element ) > 0 )
            return combineTrees( t2, t1 );
        t2.nextSibling = t1.leftChild;
        t1.leftChild = t2;
        return t1;
    }
