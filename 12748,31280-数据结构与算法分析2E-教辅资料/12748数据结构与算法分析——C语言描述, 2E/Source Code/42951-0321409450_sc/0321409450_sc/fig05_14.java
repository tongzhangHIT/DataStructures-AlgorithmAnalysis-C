public class QuadraticProbingHashTable<AnyType>
{
    public QuadraticProbingHashTable( )
      { /* Figure 5.15 */ }
    public QuadraticProbingHashTable( int size )
      { /* Figure 5.15 */ }
    public void makeEmpty( )
      { /* Figure 5.15 */ }

    public boolean contains( AnyType x )
      { /* Figure 5.16 */ }
    public void insert( AnyType x )
      { /* Figure 5.17 */ }
    public void remove( AnyType x )
      { /* Figure 5.17 */ }

    private static class HashEntry<AnyType>
    {
        public AnyType  element;  // the element
        public boolean isActive;  // false if marked deleted

        public HashEntry( AnyType e )
          { this( e, true ); }

        public HashEntry( AnyType e, boolean i )
          { element  = e; isActive = i; }
    }

    private static final int DEFAULT_TABLE_SIZE = 11;

    private HashEntry<AnyType> [ ] array; // The array of elements
    private int currentSize;              // The number of occupied cells

    private void allocateArray( int arraySize )
      { /* Figure 5.15 */ }
    private boolean isActive( int currentPos )
      { /* Figure 5.16 */ }
    private int findPos( AnyType x )
      { /* Figure 5.16 */ }
    private void rehash( )
      { /* Figure 5.22 */ }

    private int myhash( AnyType x )
      { /* See online code */ }
    private static int nextPrime( int n )
      { /* See online code */ }
    private static boolean isPrime( int n )
      { /* See online code */ }
}
