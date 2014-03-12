
public class Person implements Comparable {
    
    public String _name;
    public int _age; 

    public Person( String name, int age ) {
	_name = name;
	_age = age;
    }
    
    public String toString() {
	return _name + " " + _age;
    }
  
    public int compareTo( Object p ) {
	if ( p instanceof Person ) 
	    //return _age - ((Person)p)._age;
	    return _name.compareTo(((Person)p)._name);
	else 
	    return 0;

    }
}
