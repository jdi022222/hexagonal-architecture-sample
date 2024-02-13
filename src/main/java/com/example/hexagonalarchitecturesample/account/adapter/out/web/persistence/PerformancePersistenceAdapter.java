package com.example.hexagonalarchitecturesample.account.adapter.out.web.persistence;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.hexagonalarchitecturesample.account.adapter.out.web.persistence.repository.SpringDataPerformanceRepository;
import com.example.hexagonalarchitecturesample.account.application.port.out.LoadPerformancePort;
import com.example.hexagonalarchitecturesample.account.domain.PerformanceInfo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PerformancePersistenceAdapter implements LoadPerformancePort {
    private final SpringDataPerformanceRepository springDataPerformanceRepository;
    @Override
    public List<PerformanceInfo> getAllPerformanceInfo() {
        return springDataPerformanceRepository.findByIsReserve("enable").stream().map(PerformanceInfo::of).toList();
    }
}