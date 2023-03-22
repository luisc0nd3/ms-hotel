package com.conde.mshotel.service.impl;

import com.conde.mshotel.dto.HotelDto;
import com.conde.mshotel.entity.HotelEntity;
import com.conde.mshotel.service.BaseService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Simple @Service class.
 *
 * @author Luis Conde
 * @datetime 22 mar. 2023, 15:21:38
 */
@Service
public class HotelService implements BaseService<HotelEntity, HotelDto> {

  @Override
  public List<HotelEntity> findAll() throws SQLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public HotelEntity findById(String id) throws SQLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public HotelEntity save(HotelDto entity) throws SQLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean delete(String id) throws SQLException {
    // TODO Auto-generated method stub
    return false;
  }
  
}
