package kir.tm.controller;

import kir.tm.entity.TaskEntity;
import kir.tm.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/all")
    public String all() {
        return "Requests all from Spring Boot !";
    }

    @PostMapping
    public ResponseEntity createTask(@RequestBody TaskEntity request,
                                       @RequestParam Long userId) {
        try {
//            return  ResponseEntity.ok(request);
            return ResponseEntity.ok(taskService.createTask(request, userId));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка добавления Запроса");
        }
    }
    @GetMapping
    public ResponseEntity getOneTask(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(taskService.getOne(id));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка добавления Запроса");
        }
    }
/*    @PostMapping
    public ResponseEntity addTask(@RequestBody TaskEntity task) {
        try {
            taskService.addTask(task);
            return ResponseEntity.ok("OK");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error add Task");
        }
    }*/

//    @PutMapping
//    public TaskEntity updateRequest(@RequestBody TaskEntity request,
//                                       @RequestParam Long userId) {
//        try {
//
//        } catch (Exception e)
//    }
}
