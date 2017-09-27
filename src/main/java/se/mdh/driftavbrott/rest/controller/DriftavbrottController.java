package se.mdh.driftavbrott.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import se.mdh.driftavbrott.rest.model.Driftavbrott;
import se.mdh.driftavbrott.rest.persistence.DriftavbrottRepository;

@Component
@RestController
public class DriftavbrottController {


	@Autowired
	private DriftavbrottRepository driftavbrottRepository;

	@RequestMapping("/")
	List<Driftavbrott> home() {
		return driftavbrottRepository.findAll();
	}

	@RequestMapping(value = "/driftavbrott", method = RequestMethod.POST)
	public Driftavbrott create(@RequestBody Driftavbrott driftavbrott) {
		return driftavbrottRepository.save(driftavbrott);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{driftavbrottId}")
	public Driftavbrott get(@PathVariable String driftavbrottId) {
		return driftavbrottRepository.findOne(driftavbrottId);
	}
}
