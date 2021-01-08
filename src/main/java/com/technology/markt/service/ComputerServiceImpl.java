package com.technology.markt.service;

import com.technology.markt.domain.Computer;
import com.technology.markt.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService{

    ComputerRepository computerRepository;

    @Autowired
    public ComputerServiceImpl(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public void addComputer(Computer computer) {
        computerRepository.save(computer);
    }

    @Override
    public void deleteComputer(Computer computer) {
        computerRepository.delete(computer);
    }

    @Override
    public List<Computer> listAllComputers() {
        return computerRepository.findAll();
    }

    @Override
    public Computer getComputerByName(String name) {
        return computerRepository.getByName(name);
    }
}
