package com.example.subject.controller;

import com.example.subject.model.Subject;
import com.example.subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")

public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public ResponseEntity<List<Subject>> getSubject(){
        List<Subject> subject = subjectService.getAllSubject();
        return ResponseEntity.status (HttpStatus.OK).body(subject);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(subjectService.getSubjectById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject){
        Subject adddSubject = subjectService.addSubject(subject);
        return ResponseEntity.status(HttpStatus.CREATED).body(adddSubject);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Subject> updateSubjectById(@PathVariable Long id, @RequestBody Subject subject){
        Subject updateSubject = subjectService.updateUserById (id,subject);
        return ResponseEntity.status (HttpStatus.OK).body (updateSubject);
    }

    @PutMapping("update")
    public ResponseEntity<Subject> updateSubjectByIdRequestParam(@RequestParam Long id, @RequestBody Subject subject){
        return ResponseEntity.status (HttpStatus.OK).body (subjectService.updateUserById (id, subject));
    }

    @DeleteMapping("delete/{id}")
    public String deleteSubjectById(@PathVariable Long id){
        return "Delete subject by id = " + id;
    }

    @DeleteMapping("delete")
    public String deleteAllSubject(){
        return "Delete all subject.";
    }

}
