    // Generic findMax, with a function object.
    // Precondition: a.size( ) > 0.
    public static <AnyType>
    AnyType findMax( AnyType [ ] arr, Comparator<? super AnyType> cmp )
    {
        int maxIndex = 0;

        for( int i = 1; i < arr.size( ); i++ )
            if( cmp.compareTo( arr[ i ], arr[ maxIndex ] ) > 0 )
                maxIndex = i;

        return arr[ maxIndex ];
    }

class CaseInsensitiveCompare implements Comparator<String>
{
    public int compare( String lhs, String rhs )
      { return lhs.compareToIgnoreCase( rhs ); }
}
 
class TestProgram
{
    public static void main( String [ ] args )
    {
        String [ ] arr = { "ZEBRA", "alligator", "crocodile" };
        System.out.println( findMax( arr, new CaseInsensitiveCompare( ) ) )
    }
}
