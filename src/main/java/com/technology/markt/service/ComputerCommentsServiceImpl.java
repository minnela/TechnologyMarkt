package com.technology.markt.service;

import com.technology.markt.domain.ComputerComments;
import com.technology.markt.repository.ComputerCommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerCommentsServiceImpl implements ComputerCommentsService {

    ComputerCommentsRepository computerCommentsRepository;

    @Autowired
    public ComputerCommentsServiceImpl(ComputerCommentsRepository computerCommentsRepository)
    {
        this.computerCommentsRepository = computerCommentsRepository;
    }

    @Override
    public void addComputerComments(ComputerComments computerComments) {
        computerCommentsRepository.save(computerComments);
    }
}
