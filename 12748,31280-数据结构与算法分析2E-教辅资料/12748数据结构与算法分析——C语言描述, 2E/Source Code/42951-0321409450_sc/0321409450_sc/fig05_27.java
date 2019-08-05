class Map<KeyType,ValueType>
{
    public Map( )
    
    public void put( KeyType key, ValueType val )
    public ValueType get( KeyType key )
    public boolean isEmpty( )
    public void makeEmpty( )
    
    private QuadraticProbingHashTable<Entry<KeyType,ValueType>> items;
    
    private static class Entry<KeyType,ValueType>
    {
        KeyType key;
        ValueType value;
        // Appropriate Constructors, etc.
    }
}    
