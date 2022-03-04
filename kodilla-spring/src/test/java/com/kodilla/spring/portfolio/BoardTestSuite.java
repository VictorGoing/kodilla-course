package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite  {

    @Test
    void testTaskAdd(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getToDoList().getTasks().add("Pozmywaj");
        board.getInProgressList().getTasks().add("Pobiegaj");
        board.getDoneList().getTasks().add("Zakupy");

        Assertions.assertNotNull(board);
        Assertions.assertNotNull(board.getDoneList());
        Assertions.assertNotNull(board.getDoneList().getTasks());

    }
}
