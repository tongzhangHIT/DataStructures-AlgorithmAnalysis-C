            int i = left + 1, j = right ;
            for( ; ; )
            {
                while( a[ i ].compareTo( pivot ) < 0 ) i++;
                while( a[ j ].compareTo( pivot ) > 0 ) j--
                if( i < j )
                    swapReferences( a, i, j );
                else
                    break;
            }
