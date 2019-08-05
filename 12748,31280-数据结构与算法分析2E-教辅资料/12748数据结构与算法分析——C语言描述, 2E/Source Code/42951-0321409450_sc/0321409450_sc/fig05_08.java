public class Employee
{
    public boolean equals( Object rhs )
      { return rhs instanceof Employee && name.equals( ((Employee)rhs).name ); }

    public int hashCode( )
      { return name.hashCode( ); }

    private String name;
    private double salary;
    private int seniority;

      // Additional fields and methods
}    
