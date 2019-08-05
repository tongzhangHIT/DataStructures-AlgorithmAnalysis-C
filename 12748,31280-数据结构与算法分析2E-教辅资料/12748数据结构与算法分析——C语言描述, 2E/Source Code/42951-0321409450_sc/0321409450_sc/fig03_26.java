   /**
    * Change the size of this collection to zero.
    */
   public void clear( )
   {
       beginMarker = new Node<AnyType>( null, null, null );
       endMarker = new Node<AnyType>( null, beginMarker, null );
       beginMarker.next = endMarker;
       
       theSize = 0;
       modCount++;
   }
