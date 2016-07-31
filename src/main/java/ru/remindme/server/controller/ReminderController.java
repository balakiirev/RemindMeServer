package ru.remindme.server.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.remindme.server.entity.Remind;

import java.util.Date;

@RestController
@RequestMapping("/reminder")
public class ReminderController
{
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder()
    {
        return createMockRemind();
    }

    private Remind createMockRemind()
    {
        Remind remind = new Remind();
        remind.setId(1L);
        remind.setRemindDate(new Date());
        remind.setTitle("Mock Remind");
        return remind;
    }
}
