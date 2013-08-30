package com.ycx;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class C {
	private int id;
	private int a;
	private int b;
	static List listQuery;
	Configuration config = null;
	SessionFactory sessionFactory = null;
	Session s = null;
	Transaction tx=null;


	public C() {
		try {
			this.config = new Configuration().configure();
			this.sessionFactory = config.buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public C(int id, int a, int b) {
		super();
		this.id = id;
		this.a = a;
		this.b = b;
	}

	public List queryHibernate() {
		
		s = sessionFactory.openSession();
		tx.s.beginTransaction();
		/*
		 * String hql =
		 * "select new com.ycx.C(a.id,a.var,b.id)  from com.ycx.entity.A as a,com.ycx.entity.B as b"
		 * ;//返回对象C
		 */
		/*
		 * String hql = "select a.id,a.var  from com.ycx.entity.A as a";//
		 * 返回的是对象，因为字段全返回？
		 */
		 
		 // 返回String。如果select全字段，返回对象。
		// String hql =
		// "select a.id  from com.ycx.entity.A as a where a.id not in (select b.a.var from com.ycx.entity.B as b)";//
		

		// 下面是关于连接的
		/*
		 * 右连接 mysql> select p.lastname,p.firstname,o.orderno from persons p
		 * right join orders as o on p.id_p=o.id_p where o.orderno='34764';
		 */
		String hql = "from B";
		Query q = s.createQuery(hql);
		tx.commit();
		return q.list();
	}

	public static void main(String[] args) {
		C c = new C();
		listQuery = c.queryHibernate();
		System.out.println(listQuery.size());
		for (int i = 0; i < listQuery.size(); i++) {
			// C cc = (C) listQuery.get(i);
			// System.out.println(cc.id + " " + cc.a + " " + cc.b);

			System.out.println(listQuery.get(i));
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
