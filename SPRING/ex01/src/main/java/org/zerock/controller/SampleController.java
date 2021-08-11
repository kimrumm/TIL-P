package org.zerock.controller;

import com.oracle.tools.packager.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;

import java.util.ArrayList;

@Controller
@RequestMapping("/sample/*") //현재 클래스의 모든 메서드들의 기본적인 url 경로
@Log4j
public class SampleController {

    @RequestMapping("")
    public void basic(){

        Log.info("basic...............");
    }

    @RequestMapping(value = "/basic", method = {RequestMethod.GET,RequestMethod.POST})
    public void basicGet(){

        log.info("basic get...................");
    }

    @GetMapping("/basicOnlyGet")
    public void basicGet2(){

        log.info("basic get only get...................");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO dto) {

        Log.info(""+dto);

        return "ex01";

    }

    @GetMapping("/ex02")
    public String ex02(@RequestParam("name") String name,
                       @RequestParam("age") int age) {

        log.info("name : " + name);
        log.info("age: " + age);

        return "ex02";




    }
    @GetMapping("/ex02List")
    public String ex02List(@RequestParam("ids")ArrayList<String> ids) {

        log.info("ids : " + ids);
        return "ex02List";
    }

    @GetMapping("/ex02Bean")
    public String ex02Bean(SampleDTOList list){

        log.info("list dtos : " + list);

        return "ex02Bean";
    }


}
