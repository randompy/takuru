package py.net.random.takuru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import py.net.random.takuru.entity.GeoIssue;
import py.net.random.takuru.repository.GeoIssueRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Diego Ramírez
 * @version 1.0
 * @since 1.0 2018/06/07
 */
@RestController
@RequestMapping("/geo-issues")
public class GeoIssueRestController {

    private GeoIssueRepository repository;

    @Autowired
    public GeoIssueRestController(GeoIssueRepository repository) {
        this.repository = repository;
    }


    @RequestMapping("/")
    public List<GeoIssue> getAll() {
        return StreamUtils.createStreamFromIterator(repository.findAll().iterator()).collect(Collectors.toList());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public GeoIssue create() {
        GeoIssue g = new GeoIssue();
        g.setId(1L);
        return repository.save(g);
    }





}
