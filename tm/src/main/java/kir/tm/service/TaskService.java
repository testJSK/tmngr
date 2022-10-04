package kir.tm.service;

import kir.tm.entity.TaskEntity;
import kir.tm.entity.UserEntity;
import kir.tm.model.Task;
import kir.tm.repository.TaskRepo;
import kir.tm.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;
    @Autowired
    private UserRepo userRepo;

    public Task createRequest(TaskEntity request, Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        request.setUser(user);
        return Task.toModel(taskRepo.save(request));
    }

//    public TaskEntity updateRequest(TaskEntity request, Long userId) {
//
//    }
}
