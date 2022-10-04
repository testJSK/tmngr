package kir.tm.model;

import kir.tm.entity.TaskEntity;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime start;
    private LocalDateTime stop;
    private Long status;

    public static Task toModel(TaskEntity request){
        Task model = new Task();
        model.setId(request.getId());
        model.setTitle(request.getTitle());
        model.setDescription(request.getDescription());
        model.setStart(request.getStart());
        model.setStop(request.getStop());
        model.setStatus(request.getStatus());
        return model;
    }

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getStop() {
        return stop;
    }

    public void setStop(LocalDateTime stop) {
        this.stop = stop;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
