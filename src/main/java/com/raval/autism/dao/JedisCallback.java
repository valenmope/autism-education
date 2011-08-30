package com.raval.autism.dao;

import redis.clients.jedis.Jedis;

public interface JedisCallback<T> {

    T run(Jedis j);
}
