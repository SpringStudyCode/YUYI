package dev.aquashdw.controllerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class SampleController {
    private static final Logger logger
            = LoggerFactory.getLogger(SampleController.class);


    @GetMapping(
             "/hello"
    )
    public String hello(
            @RequestParam(name = "id",  required = false, defaultValue="") String id
    ){
        logger.info("Path: Hello");
        logger.info("Query Param id: "+id);
        return "/hello.html";
    }


    @GetMapping(
             "/hello/{id}"
    )
    public String helloPath(@PathVariable("id") String id){
        logger.info("Path Variable is: "+id);
        return "/hello.html";
    }

    @GetMapping(
            "/get-profile"
    )
    public @ResponseBody SamplePayload getProfile(){
        return new SamplePayload("aquashdw", 10, "Developer1");
    }

    @GetMapping(
            value = "/sample-image",
            produces = MediaType.IMAGE_PNG_VALUE
    )
    public byte[] sampleImage() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/static/image.png");

        return inputStream.readAllBytes();
    }

}
