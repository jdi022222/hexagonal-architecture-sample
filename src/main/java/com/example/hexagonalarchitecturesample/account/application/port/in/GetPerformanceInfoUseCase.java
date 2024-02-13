package com.example.hexagonalarchitecturesample.account.application.port.in;

import java.util.List;

import com.example.hexagonalarchitecturesample.account.domain.PerformanceInfo;

public interface GetPerformanceInfoUseCase {
    List<PerformanceInfo> getPerformanceInfoAllList();
}