package com.technology.markt.service;

import com.technology.markt.domain.Computer;

import java.util.List;

public interface ComputerService {
    void addComputer(Computer computer);
    void deleteComputer(Computer computer);
    List<Computer> listAllComputers();
    Computer getComputerByName(String name);

}
