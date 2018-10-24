package app.dao.impl;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import app.dao.BookDAO;
import app.dao.GenericDAO;
import app.model.Book;

public class BookDAOImpl extends GenericDAO<Integer, Book> implements BookDAO {
	private static final Logger logger = Logger.getLogger(BookDAOImpl.class);

	public BookDAOImpl() {
		super(Book.class);
	}

	public BookDAOImpl(SessionFactory sessionfactory) {
		setSessionFactory(sessionfactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> findAll(Integer page) {
		logger.info("load Books");
		return getSession().createQuery("From Book").setFirstResult(page != null ? (page - 1) * 4 : 0).setMaxResults(4)
				.list();
	}

	@Override
	public Long count() {
		logger.info("load Books");
		return (Long) getSession().createCriteria(Book.class).setProjection(Projections.rowCount()).uniqueResult();
	}

	@Override
	public Book findByIdLock(int id, boolean lock) {
		if (lock) {
			return getSession().get(Book.class, id, LockMode.PESSIMISTIC_WRITE);
		}
		return getSession().get(Book.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> findBookByTitle(String title) {
		Criteria criteria = getSession().createCriteria(Book.class);
		criteria.add(Restrictions.eq("tittle", title));
		List<Book> books = criteria.list();
		return books;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> findAllBookTitle() {
		return getSession().createQuery("select tittle from Book").getResultList();
	}

}
