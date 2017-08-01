package jdev.tracker;

import jdev.dto.PointDTO;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

/**
 * Created by srgva on 17.07.2017.
 */

public class TrackerTest {
    String fileName = ".\\resource\\tracks\\10164.kml";
    @Test
    public void testTracker() throws IOException {

        System.out.println("TrackerTest....");

        PointDTO point = new PointDTO();
        point.setTime(System.currentTimeMillis());
        point.setLat(50L);
        point.setLon(150L);
        point.setAutoId("z456xcv");
        ArrayList<String> s = new ArrayList<String>();

        s.add("123"); s.add("456");s.add("789");

        for(String s1 : s){
            System.out.println(s1);
        }
        System.out.println(point.toString());
        System.out.println(point.toJson());


    }


}
