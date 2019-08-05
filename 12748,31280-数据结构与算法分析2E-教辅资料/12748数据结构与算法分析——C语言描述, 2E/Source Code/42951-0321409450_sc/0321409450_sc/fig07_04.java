    /**
     * Shellsort, using Shell's (poor) increments.
     * @param a an array of Comparable items.
     */
    public static <AnyType extends Comparable<? super AnyType>>
    void shellsort( AnyType [ ] a )
    {
        int j;

        for( int gap = a.length / 2; gap > 0; gap /= 2 )
            for( int i = gap; i < a.length; i++ )
            {
                AnyType tmp = a[ i ];
                for( j = i; j >= gap &&
                            tmp.compareTo( a[ j - gap ] ) < 0; j -= gap )
                    a[ j ] = a[ j - gap ];
                a[ j ] = tmp;
            }
    }
