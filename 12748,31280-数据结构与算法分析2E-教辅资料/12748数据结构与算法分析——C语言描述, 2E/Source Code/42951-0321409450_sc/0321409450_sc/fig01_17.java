public static <AnyType extends Comparable<? super AnyType>>
AnyType findMax( AnyType [ ] arr )
{
    int maxIndex = 0;

    for( int i = 1; i < arr.length; i++ )
        if( arr[ i ].compareTo( arr[ maxIndex ] ) > 0 )
            maxIndex = i;

    return arr[ maxIndex ];
}
