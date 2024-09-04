package edu.icet.controller;

import edu.icet.dto.CustomerDto;
import edu.icet.dto.ItemDto;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RequestMapping("/item")
public interface ItemController {
    @PostMapping("/save")
    boolean saveItem(@RequestBody ItemDto dto) throws SQLException, ClassNotFoundException;

    @PutMapping("/update")
    boolean updateItem(@RequestBody ItemDto dto) throws SQLException, ClassNotFoundException;

    @DeleteMapping("/delete")
    boolean deleteItem(@RequestBody ItemDto dto) throws SQLException, ClassNotFoundException;

    @GetMapping("/get/list")
    List<ItemDto> getItem() throws SQLException, ClassNotFoundException;

    @GetMapping("/get/{id}")
    ItemDto getItemById(@PathVariable("id") String id) throws SQLException, ClassNotFoundException;
}
