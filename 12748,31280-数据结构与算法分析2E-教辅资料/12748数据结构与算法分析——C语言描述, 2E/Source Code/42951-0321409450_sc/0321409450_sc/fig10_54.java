public class Random
{
    private static final int A = 48271;
    private static final int M = 2147483647;

    public Random( )
    {
        state = System.currentTimeMillis( ) % Integer.MAX_VALUE ;
    }

    /**
     * Return a pseudorandom int, and change the
     * internal state. DOES NOT WORK.
     * @return the pseudorandom int.
     */
    public int randomIntWRONG( )
    {
        return state = ( A * state ) % M;
    }

    /**
     * Return a pseudorandom double in the open range 0..1
     * and change the internal state.
     * @return the pseudorandom double.
     */
    public double random0_1( )
    {
        return (double) randomInt( ) / M;
    }

    private int state;
}
