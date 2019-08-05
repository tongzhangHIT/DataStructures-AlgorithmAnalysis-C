class BoxingDemo
{
    public static void main( String [ ] args )
    {
        GenericMemoryCell<Integer> m = new GenericMemoryCell<Integer>( );
             
        m.write( 37 );
        int val = m.read( );
        System.out.println( "Contents are: " + val ); 
    }
}
