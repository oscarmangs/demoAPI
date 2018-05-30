package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Worker> workers = new ArrayList<>();
    List<Department> departments = new ArrayList<>();

    public Service(){
        this.workers = new ArrayList<>();
        this.departments = new ArrayList<>();
        addMockData();
    }

    public List<Worker> getWorkers(String searchString) {
        //if (searchString == "")
        return workers;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

   public void updateWorker(Worker worker){
       /* for (Worker w : workers){
            if(worker.getId() == w.getId()){
                workers.remove(worker);
                workers.add(new Worker(worker.getId(), w.getName(), w.getAge()));*/

        }

    public void deleteWorker(int id){
        for(Worker workerA : workers){
            if(workerA.getId() == id){
                workers.remove(workerA.getId());
                return;
            }
        }
    }

    public List<Department> getDepartments(String searchString) {
        if (searchString == "")
            return departments;

        ArrayList<Department> items = new ArrayList<>();
        for (Department department : departments) {
            if(department.getName().contains(searchString))
                items.add(department);
        }
        return items;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void updateDepartment(Department department){
        for (Department dep : departments){
            if(dep.getId() == department.getId()){
                int i = departments.indexOf(dep);
                departments.set(i, department);
            }
        }
    }

    public void deleteDepartment(int id){
        for(Department depA : departments){
            if(depA.getId() == id){
                departments.remove(depA.getId());
            }
        }
    }

    private void addMockData() {

        Department janitor = new Department(1, "IT");
        addDepartment(janitor);
        Department CEO = new Department(2, "CEO");
        addDepartment(CEO);
        Department developer = new Department(3, "Ekonomi");
        addDepartment(developer);
        Worker worker1 = new Worker(0, "Johan Johnsson", "30", janitor);
        addWorker(worker1);
        Worker worker2 = new Worker(1, "Oscar", "47", CEO);
        addWorker(worker2);
        Worker worker3 = new Worker(2, "johanson", "50", developer);
        addWorker(worker3);

    }


}