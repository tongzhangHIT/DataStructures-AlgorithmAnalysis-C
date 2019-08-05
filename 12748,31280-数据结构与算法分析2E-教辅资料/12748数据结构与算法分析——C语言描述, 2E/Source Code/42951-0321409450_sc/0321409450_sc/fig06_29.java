    /**
     * Insert into the priority queue, maintaining heap order.
     * @param x the item to insert.
     */
    public void insert( AnyType x )
    {
        root = merge( new Node<AnyType>( x ), root );
    }
