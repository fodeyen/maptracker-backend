package com.maptracker.controller;


import com.maptracker.model.Point;
import com.maptracker.service.PointService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/points")
public class PointController {

    private final PointService pointService;

    public PointController(PointService pointService) {
        this.pointService = pointService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("get-all-points")
    public List<Point> getAllPoints() {
        return pointService.getAllPoints();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("save-point")
    public Point savePoint(@RequestBody Point point) {
        return pointService.savePoint(point);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/delete/{id}")
    public void deletePoint(@PathVariable Long id) {
        pointService.deletePoint(id);
    }
}
