package edu.icet.dao;

import edu.icet.dto.ItemDto;

import java.sql.SQLException;
import java.util.List;

public interface ItemDao {
    boolean saveItem(ItemDto dto) throws SQLException, ClassNotFoundException;
    boolean updateItem(ItemDto dto) throws SQLException, ClassNotFoundException;
    boolean deleteItem(ItemDto dto) throws SQLException, ClassNotFoundException;
    ItemDto getItem(String code) throws SQLException, ClassNotFoundException;
    List<ItemDto> allItems() throws SQLException, ClassNotFoundException;
    ItemDto searchItem(String id) throws SQLException, ClassNotFoundException;
}
