package in.aws.main.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TextController {

	@GetMapping("text")
	 public ResponseEntity<?> test() {
        return ResponseEntity.ok("hey, Welcome to AWS deploy ");
    }
}
