package com.ood.library.repositories;

import com.ood.library.entities.Fine;
import com.ood.library.entities.Reader;

import java.util.List;

public interface IFineRepository {
    List<Fine> getReaderFines(String readerId);
}
