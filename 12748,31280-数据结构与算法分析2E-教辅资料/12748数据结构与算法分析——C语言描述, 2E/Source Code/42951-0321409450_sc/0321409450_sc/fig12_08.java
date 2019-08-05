    /**
     * Remove from the tree.
     * @param x the item to remove.
     */
    public void remove( AnyType x )
    {
        BinaryNode<AnyType> newTree;

            // If x is found, it will be at the root
        root = splay( x, root );
        if( root.element.compareTo( x ) != 0 )
            return;   // Item not found; do nothing

        if( root.left == nullNode )
            newTree = root.right;
        else
        {
            // Find the maximum in the left subtree
            // Splay it to the root; and then attach right child
            newTree = root.left;
            newTree = splay( x, newTree );
            newTree.right = root.right;
        }
        root = newTree;
    }
