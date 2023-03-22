package com.conde.mshotel.service;

import java.sql.SQLException;
import java.util.List;

/**
 * Simple interface class.
 *
 * @author Luis Conde
 * @datetime 22 mar. 2023, 15:19:36
 */
public interface BaseService<E, D> {
  public List<E> findAll() throws SQLException;

  public E findById(String id) throws SQLException;

  public E save(D entity) throws SQLException;

  public boolean delete(String id) throws SQLException;
}
