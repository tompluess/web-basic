package ch.skyr.web.basic;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author tom on 22.04.16.
 */
public class FirstTest {

    @Test
    public void test_always_success() {
        Assert.assertThat("result", CoreMatchers.equalTo("result"));
    }
}
