package ie.atu.sem2week3.service;

import org.springframework.stereotype.Service;

@Service
public class StatisticsService {

    public double average(int a, int b) {
        return (a + b) / 2.0;
    }
}
