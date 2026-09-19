package dev.aileks.Rizz.tasks.dto;

import dev.aileks.Rizz.tasks.TaskStatus;
import java.util.UUID;

public record TaskResponse(UUID id, String title, String description, TaskStatus status) {}
