package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping(value = "/findById",produces = "text/html;charset=utf-8")

    public String findById(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
