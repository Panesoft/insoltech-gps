package com.hcsinergia.delver.web.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.hcsinergia.delver.model.rest.Criteria;
import com.hcsinergia.delver.model.rest.Response;
import com.hcsinergia.delver.security.SecurityService;
import com.hcsinergia.delver.service.CipService;
import com.hcsinergia.delver.service.DatoCrudoService;
import com.hcsinergia.delver.service.GpsService;
import com.hcsinergia.delver.service.InfoService;
import com.hcsinergia.delver.service.RecorridoService;
import com.hcsinergia.delver.service.TamboService;
import com.hcsinergia.delver.service.TrasvaseService;

/**
 * Grupo de interfaces REST para
 * consultar por cada una de las entidades
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@Path("/app/sim3g")
@Component
public class RestService {
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private SecurityService securityService;
	
	private static Logger logger = Logger.getLogger(RestService.class);

	@POST
	@Path("/info")
	@Produces(MediaType.APPLICATION_XML)
	public Response findEntitiesInfo(Criteria criteria) {
		logger.info("Buscando entidades Info...");
		((SecurityService) SpringApplicationContext.getBean("securityServiceImpl")).validateUserPassword(criteria.getUser(), criteria.getPassword());
		Response response = new Response();
		try {
			InfoService service = (InfoService) SpringApplicationContext.getBean("infoServiceImpl");		
			response.setEntities(service.findEntitiesById(criteria.getIdStart(), criteria.getIdEnd()));
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.setMessage(e.getMessage());
			response.setStatus(Status.INTERNAL_SERVER_ERROR.getStatusCode());
			return response;
		}
	}
	
	@POST
	@Path("/trasvase")
	@Produces(MediaType.APPLICATION_XML)
	public Response findEntitiesTrasvase(Criteria criteria) {
		logger.info("Buscando entidades Trasvase...");
		((SecurityService) SpringApplicationContext.getBean("securityServiceImpl")).validateUserPassword(criteria.getUser(), criteria.getPassword());
		Response response = new Response();
		try { 
			TrasvaseService service = (TrasvaseService) SpringApplicationContext.getBean("trasvaseServiceImpl");		
			response.setEntities(service.findEntitiesById(criteria.getIdStart(), criteria.getIdEnd()));
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.setMessage(e.getMessage());
			response.setStatus(Status.INTERNAL_SERVER_ERROR.getStatusCode());
			return response;
		}
	}
	
	@POST
	@Path("/cip")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEntitiesCip(Criteria criteria) {
		logger.info("Buscando entidades Cip...");
		((SecurityService) SpringApplicationContext.getBean("securityServiceImpl")).validateUserPassword(criteria.getUser(), criteria.getPassword());
		Response response = new Response();
		try {
			CipService service = (CipService) SpringApplicationContext.getBean("cipServiceImpl");		
			response.setEntities(service.findEntitiesById(criteria.getIdStart(), criteria.getIdEnd()));
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.setMessage(e.getMessage());
			response.setStatus(Status.INTERNAL_SERVER_ERROR.getStatusCode());
			return response;
		}
	}
	
	@POST
	@Path("/tambo")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEntitiesTambo(Criteria criteria) {
		logger.info("Buscando entidades Tambo...");
		((SecurityService) SpringApplicationContext.getBean("securityServiceImpl")).validateUserPassword(criteria.getUser(), criteria.getPassword());
		Response response = new Response();
		try {
			TamboService service = (TamboService) SpringApplicationContext.getBean("tamboServiceImpl");		
			response.setEntities(service.findEntitiesById(criteria.getIdStart(), criteria.getIdEnd()));
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.setMessage(e.getMessage());
			response.setStatus(Status.INTERNAL_SERVER_ERROR.getStatusCode());
			return response;
		}
	}
	
	@POST
	@Path("/recorrido")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEntitiesRecorrido(Criteria criteria) {
		logger.info("Buscando entidades Recorrido...");
		((SecurityService) SpringApplicationContext.getBean("securityServiceImpl")).validateUserPassword(criteria.getUser(), criteria.getPassword());
		Response response = new Response();
		try {
			RecorridoService service = (RecorridoService) SpringApplicationContext.getBean("recorridoServiceImpl");		
			response.setEntities(service.findEntitiesById(criteria.getIdStart(), criteria.getIdEnd()));
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.setMessage(e.getMessage());
			response.setStatus(Status.INTERNAL_SERVER_ERROR.getStatusCode());
			return response;
		}
	}
	
	@POST
	@Path("/gps")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEntitiesGps(Criteria criteria) {
		logger.info("Buscando entidades Gps...");
		((SecurityService) SpringApplicationContext.getBean("securityServiceImpl")).validateUserPassword(criteria.getUser(), criteria.getPassword());
		Response response = new Response();
		try {
			GpsService service = (GpsService) SpringApplicationContext.getBean("gpsServiceImpl");		
			response.setEntities(service.findEntitiesById(criteria.getIdStart(), criteria.getIdEnd()));
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.setMessage(e.getMessage());
			response.setStatus(Status.INTERNAL_SERVER_ERROR.getStatusCode());
			return response;
		}
	}
	
	@POST
	@Path("/datocrudo")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEntitiesDatoCrudo(Criteria criteria) {
		logger.info("Buscando entidades DatoCrudo...");
		((SecurityService) SpringApplicationContext.getBean("securityServiceImpl")).validateUserPassword(criteria.getUser(), criteria.getPassword());
		Response response = new Response();
		try {
			DatoCrudoService service = (DatoCrudoService) SpringApplicationContext.getBean("datoCrudoServiceImpl");		
			response.setEntities(service.findEntitiesByDate(criteria.getDateStart(), criteria.getDateEnd()));
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.setMessage(e.getMessage());
			response.setStatus(Status.INTERNAL_SERVER_ERROR.getStatusCode());
			return response;
		}
	}
}
