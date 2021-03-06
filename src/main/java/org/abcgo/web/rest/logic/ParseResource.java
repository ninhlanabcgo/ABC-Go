package org.abcgo.web.rest.logic;

import javax.inject.Inject;

import org.abcgo.service.logic.ParseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for managing parse.
 */
@RestController
@RequestMapping("/api")
public class ParseResource {
	
	private final Logger log = LoggerFactory.getLogger(ParseResource.class);
	
	@Inject
	private ParseService parseService;
	
    @RequestMapping(value = "/areas",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String findAllArea() {
        return parseService.findAllArea();
    }
    
    @RequestMapping(value = "/data/{uri}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String findData(@PathVariable String uri) {
        return parseService.findData(uri);
    }

}
