    public void insert( AnyType [ ] x )
    {
        root = insert( x, root, 0 );
    }

    private KdNode<AnyType> insert( AnyType [ ] x, KdNode<AnyType> t, int level )
    {
        if( t == null )
            t = new KdNode<AnyType>( x );
        else if( x[ level ].compareTo( t.data[ level ] ) < 0 )
            t.left = insert( x, t.left, 1 - level );
        else
            t.right = insert( x, t.right, 1 - level );
        return t;
    }
