package edu.icet.bo.impl;

import edu.icet.bo.ItemBo;
import edu.icet.dao.ItemDao;
import edu.icet.dto.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ItemBoImpl implements ItemBo {
    @Autowired
    ItemDao itemDao;

    @Override
    public boolean saveItem(ItemDto dto) throws SQLException, ClassNotFoundException {
        return itemDao.saveItem(dto);
    }

    @Override
    public boolean updateItem(ItemDto dto) throws SQLException, ClassNotFoundException {
        return itemDao.updateItem(dto);
    }

    @Override
    public boolean deleteItem(ItemDto dto) throws SQLException, ClassNotFoundException {
        return itemDao.deleteItem(dto);
    }

    @Override
    public ItemDto getItem(String code) throws SQLException, ClassNotFoundException {
        return itemDao.getItem(code);
    }

    @Override
    public List<ItemDto> allItems() throws SQLException, ClassNotFoundException {
        return itemDao.allItems();
    }

    @Override
    public ItemDto searchItem(String id) throws SQLException, ClassNotFoundException {
        return itemDao.searchItem(id);
    }
}
