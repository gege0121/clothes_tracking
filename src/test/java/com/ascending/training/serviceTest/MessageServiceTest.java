package com.ascending.training.serviceTest;

import com.ascending.training.ApplicationBoot;
import com.ascending.training.service.MessageService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationBoot.class)
public class MessageServiceTest {
    @Autowired
    private MessageService messageService;

    @Test
    public void sendMessage() {
        messageService.sendEvent("fkw");
        Assert.assertTrue(false);
    }


}