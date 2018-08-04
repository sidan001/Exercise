package com.effective_java.concurrency;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObservableSet_1<E> extends ForwardingSet<E>  {

    public ObservableSet_1(Set<E> set) {
        super(set);
    }

    // Thread-safe observable set with CopyOnWriteArrayList
    private final List<SetObserver_1<E>> observers = new CopyOnWriteArrayList<SetObserver_1<E>>();
    
    public void addObserver(SetObserver_1<E> observer) {
        observers.add(observer);
    }
    public boolean removeObserver(SetObserver_1<E> observer) {
        return observers.remove(observer);
    }
    private void notifyElementAdded(E element) {
        for (SetObserver_1<E> observer : observers)
            observer.added(this, element);
    }

    @Override
    public boolean add(E element) {
        boolean added = super.add(element);
        if (added)
            notifyElementAdded(element);
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element : c)
            result |= add(element); // calls notifyElementAdded
        return result;
    }


    public static void main(String[] args) {
        ObservableSet_1<Integer> set = new ObservableSet_1<Integer>(new HashSet<Integer>());

        set.addObserver(new SetObserver_1<Integer>() {
            public void added(ObservableSet_1<Integer> s, Integer e) {
                System.out.println(e);
                if (e == 23) {
                    ExecutorService executor =
                            Executors.newSingleThreadExecutor();
                    final SetObserver_1<Integer> observer = this;
                    try {
                        executor.submit(() -> s.removeObserver(observer)).get();
                    } catch (ExecutionException ex) {
                        throw new AssertionError(ex.getCause());
                    } catch (InterruptedException ex) {
                        throw new AssertionError(ex.getCause());
                    } finally {
                        executor.shutdown();
                    }
                }
            }
        });
        for (int i = 0; i < 100; i++)
            set.add(i);
    }
}
