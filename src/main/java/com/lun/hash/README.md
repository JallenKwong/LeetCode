# HashMap Vs. ConcurrentHashMap Vs. SynchronizedMap – How a HashMap can be Synchronized in Java #

[https://crunchify.com/hashmap-vs-concurrenthashmap-vs-synchronizedmap-how-a-hashmap-can-be-synchronized-in-java/](https://crunchify.com/hashmap-vs-concurrenthashmap-vs-synchronizedmap-how-a-hashmap-can-be-synchronized-in-java/)

**HashMap** is a very powerful data structure in Java. We use it everyday and almost in all applications. There are quite a few examples which I have written before on How to Implement Threadsafe cache, How to convert Hashmap to Arraylist?

We used Hashmap in both above examples but those are pretty simple use cases of Hashmap. **HashMap is a non-synchronized collection class.**

## Do you have any of below questions? ##

- What’s the difference between ConcurrentHashMap and Collections.synchronizedMap(Map)?
- What’s the difference between ConcurrentHashMap and Collections.synchronizedMap(Map) in term of performance?
- ConcurrentHashMap vs Collections.synchronizedMap()
- Popular HashMap and ConcurrentHashMap interview questions

In this tutorial we will go over all above queries and reason why and how we could Synchronize Hashmap?

## Why? ##

The Map object is an associative containers that store elements, formed by a combination of a uniquely identify **key** and a mapped **value**. **If you have very highly concurrent application in which you may want to modify or read key value in different threads then it’s ideal to use Concurrent Hashmap.** Best example is Producer Consumer which handles concurrent read/write.

**So what does the thread-safe Map means?** If multiple threads access a hash map concurrently, and at least one of the threads modifies the map structurally, it must be synchronized externally to avoid an inconsistent view of the contents.

## How? ##

There are two ways we could synchronized HashMap

1. Java Collections synchronizedMap() method
2. Use ConcurrentHashMap

```
//Hashtable
Map<String, String> normalMap = new Hashtable<String, String>();
 
//synchronizedMap
synchronizedHashMap = Collections.synchronizedMap(new HashMap<String, String>());
 
//ConcurrentHashMap
concurrentHashMap = new ConcurrentHashMap<String, String>();
```

## ConcurrentHashMap ##

- You should use ConcurrentHashMap when you need very high concurrency in your project.
- It is thread safe without synchronizing the whole map.
- Reads can happen very fast while write is done with a lock.
- There is no locking at the object level.
- The locking is at a much finer granularity at a hashmap bucket level.
- ConcurrentHashMap doesn’t throw a ConcurrentModificationException if one thread tries to modify it while another is iterating over it.
- ConcurrentHashMap uses multitude of locks.


## SynchronizedHashMap ##

- Synchronization at Object level.
- Every read/write operation needs to acquire lock.
- Locking the entire collection is a performance overhead性能开销.
- This essentially gives access to only one thread to the entire map & blocks all the other threads.
- It may cause contention.
- SynchronizedHashMap returns Iterator, which fails-fast on concurrent modification.

## Now let’s take a look at code ##
1. Create class CrunchifyConcurrentHashMapVsSynchronizedHashMap.java
2. Create object for each HashTable, SynchronizedMap and CrunchifyConcurrentHashMap
3. Add and retrieve 500k entries from Map
4. Measure start and end time and display time in milliseconds
5. We will use ExecutorService to run 5 threads in parallel

## Here is a Java code: ##

[CrunchifyConcurrentHashMapVsSynchronizedMap](CrunchifyConcurrentHashMapVsSynchronizedMap.java)

- **shutdown()** means the executor service takes no more incoming tasks.
- **awaitTermination()** is invoked after a shutdown request.

And hence, you need to first shutdown the serviceExecutor and then block and wait for threads to finish.

## Eclipse Console Result: ##

	Test started for: class java.util.Hashtable
	500K entried added/retrieved in 4717 ms
	500K entried added/retrieved in 3694 ms
	500K entried added/retrieved in 3586 ms
	500K entried added/retrieved in 3533 ms
	500K entried added/retrieved in 3361 ms
	For class java.util.Hashtable the average time is 3778 ms
	
	Test started for: class java.util.Collections$SynchronizedMap
	500K entried added/retrieved in 5166 ms
	500K entried added/retrieved in 2966 ms
	500K entried added/retrieved in 2847 ms
	500K entried added/retrieved in 3111 ms
	500K entried added/retrieved in 2862 ms
	For class java.util.Collections$SynchronizedMap the average time is 3390 ms
	
	Test started for: class java.util.concurrent.ConcurrentHashMap
	500K entried added/retrieved in 5550 ms
	500K entried added/retrieved in 2010 ms
	500K entried added/retrieved in 1784 ms
	500K entried added/retrieved in 2001 ms
	500K entried added/retrieved in 1991 ms
	For class java.util.concurrent.ConcurrentHashMap the average time is 2667 ms





