package com.sunuping.integratedmemcached.domain;

import net.spy.memcached.MemcachedClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.InetSocketAddress;

@Component
public class MemcachedRunner implements CommandLineRunner {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    private MemcachedSource memcachedSource;
    private MemcachedClient client = null;

    @Override
    public void run(String... args) throws Exception {
        try {
            client = new MemcachedClient(new InetSocketAddress(memcachedSource.getIp(),memcachedSource.getPort()));
        }catch (IOException e){
//            logger.error("inint memcachedClient failed" ,e);
            System.out.println("error !");
        }

    }
    public MemcachedClient getClient(){
        return this.client;
    }
}
