package com.everset.unidirectionalmappingproject.starter;

import com.everset.unidirectionalmappingproject.entity.*;
import com.everset.unidirectionalmappingproject.service.GadgetService;
import com.everset.unidirectionalmappingproject.service.OnlineShopService;
import com.everset.unidirectionalmappingproject.service.TVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationStarter implements CommandLineRunner {

    @Autowired
    private GadgetService gadgetService;

    @Autowired
    private TVService tvService;

    @Autowired
    private OnlineShopService onlineShopService;

    @Override
    public void run(String... args) throws Exception {
        Gadget gadget = new Gadget("Gadget model", "gadget brand",430_000);
        Gadget tv = new TV("QLED 4K", "Samsung", 100_000,4.0);
        Gadget smartPhone = new SmartPhone("Iphone 14 pro", "Apple", 800_000,"Tele2", 10);
        Gadget tablet = new Tablet("Galaxy Tab 20", "Samsung", 300_000, 128);
        gadgetService.save(gadget);
        gadgetService.save(tv);
        gadgetService.save(smartPhone);
        gadgetService.save(tablet);
        TV lgTV = new TV("QLED 1080K","LG", 200_000, 2.0);
        tvService.save(lgTV);
        OnlineShop sulpakShop = new OnlineShop("Sulpak","Tolebi Ayezova", 1_200_000);
        OnlineShop technoDomShop = new OnlineShop("Techno dom","Tolebi Ayezova", 2_200_000);
        OnlineShop savedSulpakObject =  onlineShopService.save(sulpakShop);
        onlineShopService.save(technoDomShop);
        ///////////////////////////////////////
        gadget.setOnlineShop(sulpakShop);
        tv.setOnlineShop(sulpakShop);
        smartPhone.setOnlineShop(technoDomShop);
        tablet.setOnlineShop(technoDomShop);
        lgTV.setOnlineShop(technoDomShop);
        gadgetService.save(gadget);
        gadgetService.save(tv);
        gadgetService.save(smartPhone);
        gadgetService.save(tablet);
        gadgetService.save(lgTV);
        List<Gadget> gadgetList = gadgetService.getAllByShop(savedSulpakObject.getId());
        gadgetList.forEach(System.out::println);


    }
}
