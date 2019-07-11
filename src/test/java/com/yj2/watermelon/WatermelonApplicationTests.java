package com.yj2.watermelon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WatermelonApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test(){
        List<String> names = new ArrayList<String>() {{
            add("Hollis");
            add("hollischuang");
            add("H");
        }};

        List subList = names.subList(0, 1);
        System.out.println(subList);
    }

}
