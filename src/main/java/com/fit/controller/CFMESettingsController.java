
package com.fit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Sushanth Bangera
 */
@Controller
public class CFMESettingsController {
    
    public ResponseEntity saveMonthlyFee() {
        
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
