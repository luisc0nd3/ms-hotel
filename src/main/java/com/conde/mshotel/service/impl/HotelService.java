package com.conde.mshotel.service.impl;

import com.conde.mshotel.dto.HotelDto;
import com.conde.mshotel.entity.HotelEntity;
import com.conde.mshotel.exception.ResourceNotFoundException;
import com.conde.mshotel.repository.HotelRepository;
import com.conde.mshotel.service.BaseService;
import com.conde.mshotel.util.Constans;
import com.conde.mshotel.util.UtilHotel;
import java.sql.SQLException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Simple @Service class.
 *
 * @author Luis Conde
 * @datetime 22 mar. 2023, 15:21:38
 */
@RequiredArgsConstructor
@Service
public class HotelService implements BaseService<HotelEntity, HotelDto> {

  HotelRepository repository;

  @Override
  public List<HotelEntity> findAll() throws SQLException {
    return repository.findAll();
  }

  @Override
  public HotelEntity findById(String id) throws SQLException {
    if (id.isBlank()) {
      throw new ResourceNotFoundException(Constans.MSG_ID_INVALID_FORMAT);
    }

    return repository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException(Constans.MSG_HOTEL_NOT_FOUND + id));
  }

  @Override
  public HotelEntity save(HotelDto hotel) throws SQLException {

    HotelEntity entity = HotelEntity.builder().id(UtilHotel.getId()).name(hotel.getName())
        .creationDate(UtilHotel.getDateNow()).information(hotel.getInformation())
        .location(hotel.getLocation()).build();

    return repository.save(entity);
  }

  @Override
  public boolean delete(String id) throws SQLException {

    repository.deleteById(id);

    return repository.findById(id).isEmpty();
  }

}
