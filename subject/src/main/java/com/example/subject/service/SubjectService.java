package com.example.subject.service;

import com.example.subject.model.Subject;
import com.example.subject.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Subject addSubject(Subject subject){
        return subjectRepository.save(subject);
    }

    public List<Subject> getAllSubject(){
        return subjectRepository.findAll();
    }

    public Subject getSubjectById(Long id){
        return subjectRepository.findById(id).orElse(new Subject());
    }

    public Subject updateUserById(Long id, Subject subject){
        subject.setId(id);
        return subjectRepository.save(subject);
    }

    public void deleteSubjectById(Long id){
        Optional<Subject> subjectToDelete = subjectRepository.findById(id);
        subjectToDelete.ifPresent(subject -> subjectRepository.delete(subject));
    }

    public void deleteAllSubject(){
        subjectRepository.deleteAll();
    }

}