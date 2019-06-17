package cn.itcast.service.impl;

import cn.itcast.service.ItemsService;
import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items findById(int id) {
        Items items = itemsDao.findById(id);
        return items;
    }
}
