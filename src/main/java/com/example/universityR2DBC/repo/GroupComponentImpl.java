package com.example.universityR2DBC.repo;



import com.example.universityR2DBC.entity.Group;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;


/**
 * @author Grigoriy Zemlyanskiy
 * @version 1.0
 * class GroupComponentImpl
 */
@RequiredArgsConstructor
@Component
public class GroupComponentImpl implements GroupComponent {
    @Autowired
    private final GroupRepository repo;

    @Override
    public Optional<Mono<Group>> findById(Long id) {
        return Optional.of(repo.findById(id));
    }

    @Override
    public Mono<Group> findByIdOrDie(Long id) throws Exception {
        if(findById(id).isEmpty()) throw new Exception();
        return findById(id).get();
    }

    @Override
    public Mono<Group> commit(Group group) {

        this.repo.save(group).block()/*.subscribe()*/;
        return Mono.just(group);
    }

    public Flux<Group> findAll() {
        return this.repo.findAll();
    }

    @Override
    public void deleteGroupById(Long id) throws Exception {
        this.repo.deleteById(id);
    }

    @Override
    public long getMaxGroupsId() {
        return this.repo.getMaxId();
    }
}
