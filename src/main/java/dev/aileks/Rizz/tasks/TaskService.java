package dev.aileks.Rizz.tasks;

import dev.aileks.Rizz.tasks.dto.CreateTaskRequest;
import dev.aileks.Rizz.tasks.dto.TaskResponse;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
  private final TaskRepository taskRepository;

  public TaskService(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  public List<Task> getTasks() {
    return taskRepository.findAll();
  }

  public Optional<Task> getTaskById(UUID id) {
    return taskRepository.findById(id);
  }

  public TaskResponse createTask(CreateTaskRequest request) {
    Task task = new Task(request.title(), request.description(), request.status());

    Task savedTask = taskRepository.save(task);

    return new TaskResponse(
        savedTask.getId(), savedTask.getTitle(), savedTask.getDescription(), savedTask.getStatus());
  }
}
