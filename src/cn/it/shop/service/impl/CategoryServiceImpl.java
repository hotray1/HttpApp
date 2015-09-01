package cn.it.shop.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cn.it.shop.model.Category;
import cn.it.shop.service.CategoryService;
import cn.it.shop.util.HibernateSessionFactory;

public class CategoryServiceImpl implements CategoryService {

	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Category category) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		try {
			session.getTransaction().begin();
			session.save(category);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			session.getTransaction().rollback();
			throw new RuntimeException(e);
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		getSession().update(category);
	}
	


}
