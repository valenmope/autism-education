package com.raval.autism.dao;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTemplate implements InitializingBean {

    @Resource
    private JedisPool jedisPool;

    public <T> T doInJedis(JedisCallback<T> jedisCallback) {
	boolean broken = false;
	Jedis j = null;
	try {
	    j = jedisPool.getResource();
	    onDoInJedis(j, jedisCallback);
	    return jedisCallback.run(j);
	} catch (Exception e) {
	    broken = true;
	    throw new RuntimeException(e.getMessage(), e);
	} finally {
	    if (j != null) {
		if (broken) {
		    jedisPool.returnBrokenResource(j);
		} else {
		    jedisPool.returnResource(j);
		}
	    }
	}

    }

    protected void onDoInJedis(Jedis j, JedisCallback<?> jedisCallback) {
	// do nothing
    }

    @Override
    public void afterPropertiesSet() throws Exception {
	Assert.notNull(jedisPool, "Property jedisPool is required");
    }

}
