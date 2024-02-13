package com.example.hexagonalarchitecturesample.account.application.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.hexagonalarchitecturesample.account.application.port.in.GetPerformanceInfoUseCase;
import com.example.hexagonalarchitecturesample.account.application.port.out.LoadPerformancePort;
import com.example.hexagonalarchitecturesample.account.domain.PerformanceInfo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class GetPerformanceInfoService implements GetPerformanceInfoUseCase {
    private final LoadPerformancePort loadPerformancePort;

    @Override
    public List<PerformanceInfo> getPerformanceInfoAllList() {
        return loadPerformancePort.getAllPerformanceInfo();
    }
}
