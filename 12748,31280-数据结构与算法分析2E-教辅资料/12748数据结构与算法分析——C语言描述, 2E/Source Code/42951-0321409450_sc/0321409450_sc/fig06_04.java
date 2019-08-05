public class BinaryHeap<AnyType extends Comparable<? super AnyType>>
{
    public BinaryHeap( )
      { /* See online code */ }
    public BinaryHeap( int capacity )
      { /* See online code */ }
    public BinaryHeap( AnyType [ ] items )
      { /* Figure 6.14 */ }

    public void insert( AnyType x )
      { /* Figure 6.8 */ }
    public AnyType findMin( )
      { /* See online code */ }
    public AnyType deleteMin( )
      { /* Figure 6.12 */ }
    public boolean isEmpty( )
      { /* See online code */ }
    public void makeEmpty( )
      { /* See online code */ }

    private static final int DEFAULT_CAPACITY = 10;

    private int currentSize;     // Number of elements in heap
    private AnyType [ ] array;   // The heap array

    private void percolateDown( int hole )
      { /* Figure 6.12 */ }
    private void buildHeap( )
      { /* Figure 6.14 */ }
    private void enlargeArray( int newSize )
      { /* See online code */ }
}
