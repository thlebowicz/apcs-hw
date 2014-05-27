-Whereas TreeSets and HashSets are intended to work as mathematical sets with no duplicate elements, HashMaps and TreeMaps work more along the lines of a python dictionary, in that the elements are arranged in key-value pairings. In a HashMap and TreeMap, there may be duplicate values, but these values must be paired with distinct keys. Generally HashMaps are used when you want to look up elements by key, but TreeMaps are more useful to keep elements in order at all times and for situations where sequential access is necessary.

-Internally, a HashMap consists of a main array with indexes corresponding to hash values. Each index holds a corresponding linked list of entries with the same hash value.

-Internally, a TreeMap uses red-black trees, which are essentially binary search trees with more stringent properties.  

-From the SpeedTest results, it seems that the HashMap and HashSet are faster than the TreeMap and TreeSet respectively in terms of adding elements. The HashSet is the fastest out of all, with the TreeSet taking around 10x the time of the HashSet to add 10^6 elements. 

-The built in Heap data structure for java is the PriorityQueue, which orders elements according to their "natural ordering" or by a comparator passed into the constructor. 
