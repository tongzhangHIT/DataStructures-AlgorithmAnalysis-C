public class GenericMemoryCell<AnyType>
{
    public AnyType read( )
      { return storedValue; }
    public void write( AnyType x )
      { storedValue = x; }

    private AnyType storedValue;
}
