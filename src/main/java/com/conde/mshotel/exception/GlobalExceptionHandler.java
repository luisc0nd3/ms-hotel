package com.conde.mshotel.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Simple @RestControllerAdvice class.
 *
 * @author Luis Conde
 * @datetime 29 mar. 2023, 01:23:18
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

  /**
   * method that create a exception ResourceNotFoundException.
   *
   * @param exception is a ResourceNotFoundException class
   * @return ResponseEntity
   */
  public ResponseEntity<Map<String, Object>> handlerResourceNotFoundException(
      ResourceNotFoundException exception) {

    Map<String, Object> map = new HashMap<>();
    map.put("message", exception.getMessage());
    map.put("success", false);
    map.put("status", HttpStatus.NOT_FOUND);

    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);

  }
}
