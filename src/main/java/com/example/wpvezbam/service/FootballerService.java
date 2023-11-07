package com.example.wpvezbam.service;
import com.example.wpvezbam.entity.Footballer;
import com.example.wpvezbam.repository.FootballerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FootballerService {

    private final FootballerRepository footballerRepository;

    public FootballerService(FootballerRepository footballerRepository) {
        this.footballerRepository = footballerRepository;
    }

    public void save (Footballer f) {
        this.footballerRepository.save(f);
    }

    public List<Footballer> getAll () {
        return footballerRepository.findAll();
    }

    public void deleteById (Long id) {
        footballerRepository.deleteById(id);
    }

    public Footballer getFootballerById(Long id) {
        return footballerRepository.findById(id).get();
    }

}
