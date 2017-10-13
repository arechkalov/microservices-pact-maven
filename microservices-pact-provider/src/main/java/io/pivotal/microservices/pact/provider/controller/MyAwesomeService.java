package io.pivotal.microservices.pact.provider.controller;

import io.pivotal.microservices.pact.provider.Foo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by arecicalov on 10/13/2017.
 */
@RestController
public class MyAwesomeService {

    @RequestMapping(value = "/foos", method = RequestMethod.GET)
    public ResponseEntity<List<Foo>> foos() {
        return new ResponseEntity<>(Arrays.asList(new Foo(42), new Foo(100)), HttpStatus.OK);
    }
}
