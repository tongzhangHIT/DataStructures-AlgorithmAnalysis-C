public class TestMemoryCell
{
    public static void main( String [ ] args )
    {
        MemoryCell m = new MemoryCell( );

        m.write( "37" );
        String val = (String) m.read( );
        System.out.println( "Contents are: " + val );
    }
}
