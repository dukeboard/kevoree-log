package org.kevoree.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: duke
 * Date: 19/08/13
 * Time: 16:43
 */
public class Slf4JCompatTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void compatTest(){

        final Boolean[] isPrintted = {false};

        Log.setLogger(new Log.Logger(){
            @Override
            protected void print(String message) {
                super.print(message);
                isPrintted[0] =true;
            }
        });

        logger.info("Hello");

        assert (isPrintted[0] == true);

    }

}
