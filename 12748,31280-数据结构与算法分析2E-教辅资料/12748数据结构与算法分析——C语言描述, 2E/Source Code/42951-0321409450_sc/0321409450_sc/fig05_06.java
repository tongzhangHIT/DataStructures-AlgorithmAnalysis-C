public class SeparateChainingHashTable<AnyType>
{
    public SeparateChainingHashTable( )
      { /* Figure 5.9 */ }
    public SeparateChainingHashTable( int size )
      { /* Figure 5.9 */ }

    public void insert( AnyType x )
      { /* Figure 5.10 */ }
    public void remove( AnyType x )
      { /* Figure 5.10 */ }
    public boolean contains( AnyType x )
      { /* Figure 5.10 */ }
    public void makeEmpty( )
      { /* Figure 5.9 */ }

    private static final int DEFAULT_TABLE_SIZE = 101;

    private List<AnyType> [ ] theLists; 
    private int currentSize;

    private void rehash( )
      { /* Figure 5.22 */ }
    private int myhash( AnyType x )
      { /* Figure 5.7 */ }

    private static int nextPrime( int n )
      { /* See online code */ }
    private static boolean isPrime( int n )
      { /* See online code */ }
}
