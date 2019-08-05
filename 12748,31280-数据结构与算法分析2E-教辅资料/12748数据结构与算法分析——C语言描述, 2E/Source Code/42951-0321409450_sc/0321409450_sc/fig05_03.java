        public static int hash( String key, int tableSize )
        {
            return ( key.charAt( 0 ) + 27 * key.charAt( 1 ) +
                     729 * key.charAt( 2 ) ) % tableSize;
        }
