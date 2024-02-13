package com.example.hexagonalarchitecturesample.account.application.port.out;

import java.util.List;

import com.example.hexagonalarchitecturesample.account.domain.PerformanceInfo;

public interface LoadPerformancePort {
    List<PerformanceInfo> getAllPerformanceInfo();
}
