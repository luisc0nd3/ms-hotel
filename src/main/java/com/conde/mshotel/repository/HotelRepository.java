package com.conde.mshotel.repository;

import com.conde.mshotel.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Simple @Repository class.
 *
 * @author Luis Conde
 * @datetime 22 mar. 2023, 15:16:38
 */
public interface HotelRepository extends JpaRepository<HotelEntity, String> {

}
