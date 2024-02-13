package com.example.hexagonalarchitecturesample.account.adapter.in.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hexagonalarchitecturesample.account.application.port.in.GetPerformanceInfoUseCase;
import com.example.hexagonalarchitecturesample.account.domain.PerformanceInfo;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/performance")
@RequiredArgsConstructor
public class PerformanceController {
    private final GetPerformanceInfoUseCase getPerformanceInfoUseCase;

    @GetMapping
    public List<PerformanceInfo> getAllPerformanceInfo() {
        return getPerformanceInfoUseCase.getPerformanceInfoAllList();
    }
}