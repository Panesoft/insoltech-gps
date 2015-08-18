package com.hcsinergia.delver.persistence;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.hcsinergia.delver.model.DatoCrudo;

@Repository
public class DatoCrudoDao extends Dao<DatoCrudo>{
	
	@SuppressWarnings("unchecked")
	public List<DatoCrudo> findDatoCrudoByDate(Date dateStart, Date dateEnd) {		
		Query query = getEntityManager().createQuery("select d from DatoCrudo d where d.fechaAlta between :dateStart and :dateEnd");
		query.setParameter("dateStart", dateStart);
		query.setParameter("dateEnd", dateEnd);
		return query.getResultList();
	}
}
