package com.strategicgains.restexpress.scaffold.minimal.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.strategicgains.hyperexpress.domain.LinkableCollection;
import com.strategicgains.restexpress.Request;
import com.strategicgains.restexpress.Response;
import com.strategicgains.restexpress.scaffold.minimal.dto.MessageActionDto;

public class JAXRS2ControllerImpl implements JAXRS2Controller {
	private static final Logger LOG = LoggerFactory
			.getLogger(JAXRS2ControllerImpl.class);

	public JAXRS2ControllerImpl() {
		super();
	}

	public Object create(MessageActionDto dto) {
		LOG.info("create: " + dto);
		return dto;
	}

	public Object read(String id, String name) {
		LOG.info("Path para: " + id);
		LOG.info("Query para: " + name);
		return id + name;
	}

	public LinkableCollection<Object> readAll() {
		System.out.println("Are you readAll of me");
		List<Object> res = new ArrayList<Object>();
		res.add("First");
		res.add("Second");
		res.add(new Date());

		return new LinkableCollection<Object>(res);
	}

	public Object update(String id, MessageActionDto dto) {
		LOG.info("update: " +id + "-" + dto);
		return dto;
	}

	public void delete(int id) {
		LOG.info("id: " + id);
	}

	public String readAsString(Request request, Response response) {
		return "I give you string only!!!";
	}
	

	public String readPathAndQuery(String version, Date releaseDate) {
        LOG.info("version: " + version);
        LOG.info("releaseOn: " + releaseDate);
        return version + releaseDate;
    }

}
