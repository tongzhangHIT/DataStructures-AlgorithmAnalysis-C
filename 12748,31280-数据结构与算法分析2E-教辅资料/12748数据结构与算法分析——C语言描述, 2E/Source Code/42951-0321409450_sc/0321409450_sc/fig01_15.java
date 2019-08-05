public static <AnyType> boolean contains( AnyType [ ] arr, AnyType x )
{
    for( AnyType val : arr )
        if( x.equals( val ) )
            return true;

    return false;
}
