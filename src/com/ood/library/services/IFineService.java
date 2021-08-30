package com.ood.library.services;

import com.ood.library.entities.Reader;

public interface IFineService {
    boolean isFinePending(String readerId);
}
