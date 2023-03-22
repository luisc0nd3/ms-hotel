package com.conde.mshotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Simple @Entity class.
 *
 * @author Luis Conde
 * @datetime 22 mar. 2023, 14:08:53
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tbl_hotel")
public class HotelEntity {
  
  @Id
  @Column(name = "col_id")
  private String id;

  @Column(name = "col_name", length = 20)
  private String name;

  @Column(name = "col_location", length = 30)
  private String location;

  @Column(name = "col_information", length = 100)
  private String information;
  
  @Column(name = "col_timestamp", length = 20)
  private String timestamp;
}
