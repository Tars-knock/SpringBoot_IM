import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;


@Component
class allTest{

    @Value("${redis.host}")
    private String host;
    @Value("${redis.port}")
    private int port;

    @org.junit.jupiter.api.Test
    void test(){
        StringBuffer sb = new StringBuffer();
        char[] sc = new char[]{'t', 'e', 's', 't'};
        System.out.println(sc);
    }

    @org.junit.jupiter.api.Test
    void testIntegerNull(){
        Integer test  = null;
        if(test != 1) System.out.println("null是0");
    }

    @Test
    void testJedis(){
        Jedis jedis = new Jedis(host, port);
        jedis.set("singleJedis", "hello jedis!");
        System.out.println(jedis.get("singleJedis"));
        jedis.close();
    }

}
