<<<<<<< HEAD
package edu.sussex.coms223.lab2;

/**
 * The Interface Map. Maintain a collection of values of generic type V that are
 * looked up (mapped) by keys of generic type K.
 * 
 * Constraints:
 * Neither a key nor value may be null.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public interface Map<K, V> {
	V put(K key, V value);

	V get(K key);

	V remove(K key);

	int size();

	void clear();
	
	void print();
}
=======
package edu.sussex.coms223.lab2;

/**
 * The Interface Map. Maintain a collection of values of generic type V that are
 * looked up (mapped) by keys of generic type K.
 * 
 * Constraints:
 * Neither a key nor value may be null.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public interface Map<K, V> {
	V put(K key, V value);

	V get(K key);

	V remove(K key);

	int size();

	void clear();
}
>>>>>>> e4a33cdd5481d9dea8affbc0e1c6c83177970e86
