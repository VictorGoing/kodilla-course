package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Task: Task from 17.2";

    @Test
    void testFindByListName(){
        TaskList taskList = new TaskList("Lista Testowa",DESCRIPTION);

        taskListDao.save(taskList);

        String listName = taskList.getListName();

        List<TaskList> result = taskListDao.findByListName(listName);

        Assertions.assertEquals(1,result.size());

        taskListDao.deleteByListName(listName);
    }

}
