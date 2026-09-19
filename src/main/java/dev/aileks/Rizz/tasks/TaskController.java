package dev.aileks.Rizz.tasks;

import dev.aileks.Rizz.tasks.dto.CreateTaskRequest;
import dev.aileks.Rizz.tasks.dto.TaskResponse;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

  private final TaskService taskService;
  private final TaskRepository taskRepository;

  public TaskController(TaskService taskService, TaskRepository taskRepository) {
    this.taskService = taskService;
    this.taskRepository = taskRepository;
  }

  public List<Task> getTask() {
    return taskRepository.findAll();
  }

  @PostMapping
  public TaskResponse createTask(@RequestBody CreateTaskRequest request) {
    return taskService.createTask(request);
  }
}
