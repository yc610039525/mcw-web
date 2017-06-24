package test.ehcache;

import junit.framework.Assert;

import net.sf.ehcache.Element;

import org.junit.Test;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.ehcache.EhCacheCacheManager;

import base.SpringTestBaseCase;

public class Ehcache extends SpringTestBaseCase {
	@Test
	public void ehcacheTest(){
		EhCacheCacheManager cacheManager=(EhCacheCacheManager)context.getBean("cacheManager");
		Assert.assertNotNull(cacheManager);
		System.out.println("cacheManager:"+cacheManager);
		Cache cache = cacheManager.getCache("helloworld");
		cache.put("greeting", "Hello, World!");
		Object object = cache.get("greeting").get();
		System.out.println(object);
		
	}
}
