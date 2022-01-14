package com.liulq.gradle.todo.TodoRepository;

import java.util.HashMap;
import java.util.Map;
import com.liulq.gradle.todo.model.TodoItem;

/**
 * @author liulq
 * @version 1.0
 * @description: TODO
 * @date 2022/1/10 19:14
 */
public class TodoRepository {
    private static Map<String, TodoItem> items = new HashMap<>();

    public void save(TodoItem item){
        System.out.println("" + item);
        items.put(item.getName(), item);
    }

    public TodoItem find(String name) {
        return items.get(name);
    }
}
