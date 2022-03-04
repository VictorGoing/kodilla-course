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
    @Qualifier("todo")
    TaskList todo;

    @Lazy
    @Autowired
    @Qualifier("todo")
    TaskList inpro;

    @Lazy
    @Autowired
    @Qualifier("todo")
    TaskList done;

    @Bean(name = "todo")
    @Scope("prototype")
    TaskList getTodo(){
        return new TaskList();
    }

    @Bean(name = "inpro")
    @Scope("prototype")
    TaskList getInPro(){
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    TaskList getDone(){
        return new TaskList();
    }

    @Bean
    public Board getBoardOne(){
        return new Board(todo,inpro,done);
    }

}
