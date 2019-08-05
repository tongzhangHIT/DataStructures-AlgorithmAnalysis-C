    /**
     * Insert into the tree.
     * @param x the item to insert.
     */
    public void insert( AnyType x )
    {
        if( newNode == null )
            newNode = new BinaryNode<AnyType>( null );
        newNode.element = x;

        if( root == nullNode )
        {
            newNode.left = newNode.right = nullNode;
            root = newNode;
        }
        else
        {
            root = splay( x, root );
            if( x.compareTo( root.element ) < 0 )
            {
                newNode.left = root.left;
                newNode.right = root;
                root.left = nullNode;
                root = newNode;
            }
            else
            if( x.compareTo( root.element ) > 0 )
            {
                newNode.right = root.right;
                newNode.left = root;
                root.right = nullNode;
                root = newNode;
            }
            else
                return;   // No duplicates
        }
        newNode = null;   // So next insert will call new
    }
