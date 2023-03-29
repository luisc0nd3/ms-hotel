package com.conde.mshotel.exception;

/**
 * Simple RuntimeException class.
 *
 * @author Luis Conde
 * @datetime 29 mar. 2023, 00:50:39
 */
public class ResourceNotFoundException extends RuntimeException {

  /**
   * serialVersionUID.
   */
  private static final long serialVersionUID = -6408002741464733639L;

  public ResourceNotFoundException() {
    super("Resource not found on server.");
  }

  public ResourceNotFoundException(String message) {
    super(message);
  }

}
