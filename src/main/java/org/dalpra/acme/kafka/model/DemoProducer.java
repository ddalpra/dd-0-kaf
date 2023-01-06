package org.dalpra.acme.kafka.model;

import java.util.concurrent.ExecutionException;

public interface DemoProducer<K, V> {
    void produce(K key, V value) throws ExecutionException, InterruptedException;

    void produceAsync(K key, V value);
}