package com.ood.library.services.impl;

import com.ood.library.entities.Fine;
import com.ood.library.repositories.IFineRepository;
import com.ood.library.services.IFineService;

import java.util.List;

public class FineService implements IFineService {

    IFineRepository fineRepository;



    @Override
    public boolean isFinePending(String readerId) {
        List<Fine> allFines = fineRepository.getReaderFines(readerId);
        for(Fine fine : allFines) {
            if(!fine.isPaid()) return true;
        }
        return false;
    }
}
