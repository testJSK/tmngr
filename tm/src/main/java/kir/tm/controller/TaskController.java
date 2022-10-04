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
    public ResponseEntity createRequest(@RequestBody TaskEntity request,
                                       @RequestParam Long userId) {
        try {
//            return  ResponseEntity.ok(request);
            return ResponseEntity.ok(taskService.createRequest(request, userId));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка добавления Запроса");
        }
    }

//    @PutMapping
//    public TaskEntity updateRequest(@RequestBody TaskEntity request,
//                                       @RequestParam Long userId) {
//        try {
//
//        } catch (Exception e)
//    }
}
