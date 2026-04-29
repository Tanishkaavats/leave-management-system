package com.tanishka.leavemanagement;

import com.tanishka.leavemanagement.model.Leave;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/leave")
public class LeaveController {

    List<Leave> leaves = new ArrayList<>();

    @GetMapping
    public List<Leave> getLeaves() {
        return leaves;
    }

    @PostMapping
    public String addLeave(@RequestBody Leave leave) {
        leaves.add(leave);
        return "Leave added successfully";
    }

    @PutMapping("/{id}")
    public String updateLeave(@PathVariable int id, @RequestBody Leave updatedLeave) {
        for (Leave l : leaves) {
            if (l.getId() == id) {
                l.setEmployeeName(updatedLeave.getEmployeeName());
                l.setReason(updatedLeave.getReason());
                l.setStatus(updatedLeave.getStatus());
                return "Leave updated";
            }
        }
        return "Leave not found";
    }

    @DeleteMapping("/{id}")
    public String deleteLeave(@PathVariable int id) {
        leaves.removeIf(l -> l.getId() == id);
        return "Leave deleted";
    }
}