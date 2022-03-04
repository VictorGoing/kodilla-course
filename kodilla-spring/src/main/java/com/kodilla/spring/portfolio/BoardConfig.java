package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class BoardConfig {


    @Lazy
    @Autowired
    @Qualifier("board1")
    Board board;

    @Bean(name = "board1")
    @Scope("prototype")
    public Board getBoardOne(){
        return new Board(new TaskList(),new TaskList(),new TaskList());
    }

}
