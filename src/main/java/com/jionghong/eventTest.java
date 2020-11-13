package com.jionghong;

import com.jionghong.DAO.EventDAO;
import com.jionghong.entity.EventEntity;
import org.junit.Test;

import java.util.List;

public class eventTest {
    private EventDAO eventDAO = new EventDAO();
    @Test
    public void insert(){
        EventEntity entity=new EventEntity("abcc","abcccc");
        eventDAO.insert(entity);
    }
    @Test
    public void findAll(){

        List<EventEntity> entities=eventDAO.findAll();
        for (EventEntity e : entities) {
            System.out.println(e.toString());
        }
    }
    @Test
    public void delete() {
        EventEntity entity=new EventEntity( 25,"abcc", "abcccc");
        eventDAO.delete(entity);
    }
    @Test
    public void update(){
        EventEntity entity=new EventEntity( 24,"xx", "ppppxxxx");
        eventDAO.update(entity);
    }

}
