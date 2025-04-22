One important thing i learnt today 

that Object class which is extended by each and every class 
has 3 main methods 

wait() 
notify()
notifyAll()

Object lock = new Object();

so when we use
synchronized (lock) --> when we use it like this , 

and then we can use lock.wait() , lock.notify() and lock.notifyAll()

notify() --> this method makes the OS scheduler make arbritary choice on picking up the thread , only 1 thread is notified about the state 
notifyAll() --> this notifies all the threads who are waiting on this resource , but OS decides who gets the lock


We will try to implement a producer consumer problem to solidify our understanding 
