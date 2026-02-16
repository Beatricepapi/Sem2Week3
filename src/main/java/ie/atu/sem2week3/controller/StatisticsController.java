package ie.atu.sem2week3.controller;

import ie.atu.sem2week3.service.StatisticsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stats")
public class StatisticsController {

    private final StatisticsService statisticsService;

    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping("/average")
    public ResponseEntity<?> calculateAverage(@RequestParam int a,
                                              @RequestParam int b) {

        // RULE: No negative numbers allowed
        if (a < 0 || b < 0) {
            return ResponseEntity
                    .badRequest()
                    .body("Negative numbers are not allowed");
        }

        double result = statisticsService.average(a, b);
        return ResponseEntity.ok(result);
    }
}
