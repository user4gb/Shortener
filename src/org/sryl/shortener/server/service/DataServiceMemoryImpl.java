/**
 * 
 */
package org.sryl.shortener.server.service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author Cyril Lacote <cyril.lacote@gmail.com>
 */
public class DataServiceMemoryImpl implements DataService {

	ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>();
	
	/**
	 * @see org.sryl.shortener.server.service.DataService#get(java.lang.String)
	 */
	@Override
	public String get(String key) {
		return map.get(key);
	}

	/**
	 * @see org.sryl.shortener.server.service.DataService#put(java.lang.String, java.lang.String)
	 */
	@Override
	public void put(String key, String value) {
		map.putIfAbsent(key, value);
	}

}