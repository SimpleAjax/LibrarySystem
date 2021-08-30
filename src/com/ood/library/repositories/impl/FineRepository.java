package com.ood.library.repositories.impl;

import com.ood.library.entities.Fine;
import com.ood.library.repositories.IFineRepository;

import java.util.List;
import java.util.Map;

public class FineRepository implements IFineRepository {

    Map<String, List<Fine>> fineMap;

    public FineRepository(Map<String, List<Fine>> fineMap) {
        this.fineMap = fineMap;
    }

    @Override
    public List<Fine> getReaderFines(String readerId) {
        return fineMap.get(readerId);
    }
}
