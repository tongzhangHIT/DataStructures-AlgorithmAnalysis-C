public static double totalArea( Collection<Shape> arr )
{
    double total = 0;

    for( Shape s : arr )
        if( s != null )
            total += s.area( );

    return total;
}
