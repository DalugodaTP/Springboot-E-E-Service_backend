package edu.icet.controller.impl;

import edu.icet.bo.CustomerBo;
import edu.icet.bo.ItemBo;
import edu.icet.controller.ItemController;
import edu.icet.dto.CustomerDto;
import edu.icet.dto.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class ItemControllerImpl implements ItemController {

    @Autowired
    private ItemBo itemBo;
    @Override
    public boolean saveItem(ItemDto dto) throws SQLException, ClassNotFoundException {
        return itemBo.saveItem(dto);
    }

    @Override
    public boolean updateItem(ItemDto dto) throws SQLException, ClassNotFoundException {
        return itemBo.updateItem(dto);
    }

    @Override
    public boolean deleteItem(ItemDto dto) throws SQLException, ClassNotFoundException {
        return itemBo.deleteItem(dto);
    }

    @Override
    public List<ItemDto> getItem() throws SQLException, ClassNotFoundException {
        return itemBo.allItems();
    }

    @Override
    public ItemDto getItemById(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
