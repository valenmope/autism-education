package com.raval.autism.dao;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import com.raval.autism.dao.interfaces.CommonDao;
import com.raval.autism.datamodel.user.Contact;

@Repository
public class ActivityDaoImpl implements CommonDao {

    @Resource
    private JedisPool jedisPool;

    public boolean addUser(Contact user) {
	boolean success = true;
	Jedis jedis = jedisPool.getResource();
	try {
	    // / ... do stuff here ... for example
	    jedis.set("foo", "bar");
	    String foobar = jedis.get("foo");
	    jedis.zadd("sose", 0, "car");
	    jedis.zadd("sose", 0, "bike");
	    Set<String> sose = jedis.zrange("sose", 0, -1);
	} finally {
	    // / ... it's important to return the Jedis instance to the pool
	    // once you've finished using it
	    jedisPool.returnResource(jedis);
	}
	// / ... when closing your application:
	jedisPool.destroy();
	return success;
    }

    @Override
    public void save() {
	// TODO Auto-generated method stub

    }

    @Override
    public void loadById(String id) {
	// TODO Auto-generated method stub

    }

}
