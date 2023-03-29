package com.conde.mshotel.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * Simple Util class.
 *
 * @author Luis Conde
 * @datetime 29 mar. 2023, 00:21:22
 */
public class UtilHotel {

  private UtilHotel() {}

  /**
   * method that generates the id for a hotel.
   *
   * @return a randomUUID
   */
  public static String getId() {
    return UUID.randomUUID().toString().substring(0, 10);
  }

  /**
   * method that generates the current date with format.
   *
   * @return a date with format 2021-03-24T16:44:39.083+08:00
   */
  public static String getDateNow() {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    return simpleDateFormat.format(timestamp);
  }

}
