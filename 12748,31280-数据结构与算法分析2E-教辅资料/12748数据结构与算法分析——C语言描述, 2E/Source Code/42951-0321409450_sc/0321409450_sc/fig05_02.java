        public static int hash( String key, int tableSize )
        {
            int hashVal = 0;

            for( int i = 0; i < key.length( ); i++ )
                hashVal += key.charAt( i );

            return hashVal % tableSize;
        }
