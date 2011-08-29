package com.raval.autism.dao;

import com.raval.autism.dao.interfaces.CommonDao;
import com.raval.autism.datamodel.user.Contact;

public class ActivityDaoImpl implements CommonDao {

    private RedisTemplate<String, String> redisTemplate;

    private final String userKey = "global.nextUserId";

    public boolean addUser(Contact user) {
	boolean success = true;
	try {
	    ValueOperations<String, String> valueOps = redisTemplate
		    .getValueOps();
	    long userKeyValue = valueOps.increment(userKey, 1);
	    valueOps.set("uid:" + String.valueOf(userKeyValue) + ":name",
		    user.getName());
	    // valueOps.set("uid:" + String.valueOf(userKeyValue) + ":lastName",
	    // user.getLastName());
	    valueOps.set("uid:" + String.valueOf(userKeyValue) + ":email",
		    user.getEmail());
	    valueOps.set("uid:" + String.valueOf(userKeyValue)
		    + ":auditCreationDate", user.getAuditCreationDate()
		    .toString());
	    valueOps.set("uid:" + String.valueOf(userKeyValue)
		    + ":auditModificationDate", user.getAuditModificationDate()
		    .toString());
	    // valueOps.set("uid:" + String.valueOf(userKeyValue) + ":idFon",
	    // user.getIdFon());
	    // valueOps.set("uid:" + String.valueOf(userKeyValue) +
	    // ":idPartner", user.getIdPartner());
	    // valueOps.set("uid:" + String.valueOf(userKeyValue) + ":partner",
	    // user.getPartner());
	    // valueOps.set("username:" + user.getIdFon() + ":uid",
	    // String.valueOf(userKeyValue));
	} catch (Exception e) {
	    e.printStackTrace();
	    success = false;
	}
	return success;
    }

    public void save() {
	// TODO Auto-generated method stub

    }

    public void loadById(String id) {
	// TODO Auto-generated method stub

    }

}
