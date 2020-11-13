package com.jionghong.DAO;


import com.jionghong.entity.EventEntity;
import com.jionghong.config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;


public class EventDAO {

    public void insert(EventEntity entity){
        Session session = HibernateConfig.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
    }

    public void delete(EventEntity entity){
        Session session = HibernateConfig.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    public void update(EventEntity entity){
        Session session = HibernateConfig.getSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
    }

    public List<EventEntity> findAll() {
        return HibernateConfig.getSession().createQuery("from EventEntity").list();
    }

}
