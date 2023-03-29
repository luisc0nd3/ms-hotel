package com.conde.mshotel.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Simple dto class.
 *
 * @author Luis Conde
 * @datetime 22 mar. 2023, 15:23:19
 */
@Data
@Builder
public class HotelDto {
  private String name;
  private String location;
  private String information;
}
