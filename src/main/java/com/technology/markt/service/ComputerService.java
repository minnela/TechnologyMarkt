package com.technology.markt.service;

import com.technology.markt.domain.Computer;

import java.util.List;

public interface ComputerService {
    public void addComputer(Computer computer);
    public void deleteComputer(Computer computer);
    public List<Computer> listAllComputers();
    public Computer getComputerByName(String name);

}
