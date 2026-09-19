package dev.aileks.Rizz.tasks.dto;

import dev.aileks.Rizz.tasks.TaskStatus;

public record UpdateTaskRequest(String title, String description, TaskStatus status) {}
