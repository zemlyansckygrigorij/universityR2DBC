package com.example.universityR2DBC.controller;

import com.example.universityR2DBC.controller.model.request.GroupRequest;
import com.example.universityR2DBC.entity.Group;
import com.example.universityR2DBC.repo.GroupComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;


/**
 * @author Grigoriy Zemlyanskiy
 * @version 1.0
 * class GroupController
 * для работы с web сайтом /groups
 */

@RestController
@Validated
@RequestMapping("/webflux/groups")
@RequiredArgsConstructor
public class GroupController {
    private final GroupComponent groupComponent;


    @GetMapping("")
    public Flux<Group> getAllGroups() {
        return  groupComponent.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Group> getGroupById( @PathVariable(name = "id") final long id) throws Exception {
        return  groupComponent.findByIdOrDie(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(
            @PathVariable(name = "id") final long id
    ) throws Exception {
        groupComponent.deleteGroupById(id);
    }
    @PostMapping()
    public Mono<Group> createGroup(@RequestBody GroupRequest request) {
        return  groupComponent.commit(builder(request));
    }

    public Group builder(GroupRequest request) {
        Group group = new Group();
        if (Optional.ofNullable(request.getId()).isPresent()) {
            group.setId(request.getId());
        }else{ group.setId(/*groupComponent.getMaxGroupsId()+1*/ 4L);}
        group.setName(request.getName());
        group.setSpecification(request.getSpecification());
        return group;
    }
}


