package com.wangzi.spring;


public class Service {
	
	private Dao mysqlDao;
    private Dao mongoDao;
	
	public Dao getMysqlDao() {
		return mysqlDao;
	}


	public void setMysqlDao(Dao mysqlDao) {
		this.mysqlDao = mysqlDao;
	}


	public Dao getMongoDao() {
		return mongoDao;
	}


	public void setMongoDao(Dao mongoDao) {
		this.mongoDao = mongoDao;
	}

    @Override
    public String toString() {
        return super.toString() + "\n\t\t\t\t\t{" +
            "mysqlDao=" + mysqlDao +
            ", mongoDao=" + mongoDao +
            '}';
    }
}
