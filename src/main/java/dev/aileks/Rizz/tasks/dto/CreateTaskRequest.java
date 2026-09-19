package dev.aileks.Rizz.tasks.dto;

import dev.aileks.Rizz.tasks.TaskStatus;

public record CreateTaskRequest(String title, String description, TaskStatus status) {}
