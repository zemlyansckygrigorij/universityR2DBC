package com.example.universityR2DBC.controller.model.request;

import com.example.universityR2DBC.entity.Group;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Запрос по данным группы.
 */

@Schema(description = "Данные группы")
@Data
@Getter
@Setter
@AllArgsConstructor
public class GroupRequest {
    @Schema(description = "Идентификатор группы")
    @JsonProperty("id")
    private Long id;

    @Schema(description = "Название группы")
    @JsonProperty("name")
    private String name;

    @Schema(description = "Описание группы")
    @JsonProperty("specification")
    private String specification;

    public GroupRequest(Group group) {
        this.id = group.getId();
        this.name = group.getName();
        this.specification = group.getSpecification();
    }
}