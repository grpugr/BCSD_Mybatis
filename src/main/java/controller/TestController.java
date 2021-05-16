package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TestService;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity test(){
        return new ResponseEntity( testService.test(), HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity getUser(){
        return new ResponseEntity( testService.getUsers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity postUser(){
        return new ResponseEntity( testService.postUsers(), HttpStatus.OK);
    }


    @RequestMapping(value = "/user", method = RequestMethod.PATCH)
    public ResponseEntity patchUser(){
        return new ResponseEntity( testService.patchUsers(), HttpStatus.OK);
    }


    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public ResponseEntity deleteUser(){
        return new ResponseEntity( testService.deleteUsers(), HttpStatus.OK);
    }

}
