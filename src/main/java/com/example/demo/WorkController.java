package com.example.demo;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import sun.misc.Request;
//import sun.rmi.runtime.Log;

import java.util.List;

@RestController
//@RequestMapping("/office")
public class WorkController {

    Service service  = new Service();

    @RequestMapping(value = "/workers", method = RequestMethod.GET)
    public List<Worker> getWorkers(@RequestParam(value="searchstring", defaultValue = "") String searchString){
        return service.getWorkers(searchString);
    }

    @RequestMapping(value = "/workers", method = RequestMethod.POST)
    public Worker addWorker(@RequestBody Worker worker){
        service.addWorker(worker);
        return worker;
    }

    @RequestMapping(value = "/workers/{id}", method = RequestMethod.PUT)
    public @ResponseBody String updateWorker(@RequestBody Worker worker){
        service.updateWorker(worker);
        System.out.println(worker.toString());
        return "ok";
    }

    @RequestMapping(value = "/workers/{id}", method = RequestMethod.DELETE)
    public void deleteWorker(@PathVariable("id") int workerId){
        service.deleteWorker(workerId);
    }

    @RequestMapping(value = "/departments", method = RequestMethod.GET)
    public List<Department> getDepartments(@RequestParam(value = "searchstring", defaultValue = "") String searchString){
        return service.getDepartments(searchString);
    }

    @RequestMapping(value = "/departments", method = RequestMethod.POST)
    public Department addDepartment(@RequestBody Department department){
        service.addDepartment(department);
        return department;
    }

    @RequestMapping(value = "/departments/{id}", method = RequestMethod.PUT)
    public @ResponseBody String updateDepartment(@RequestBody Department department){
        service.updateDepartment(department);
        System.out.println();
        return "ok";
    }

    @RequestMapping(value = "/departments/{id}", method = RequestMethod.DELETE)
    public @ResponseBody String deleteDepartment(@PathVariable int id){
        service.deleteDepartment(id);
        System.out.println();
        return "ok";
    }

}