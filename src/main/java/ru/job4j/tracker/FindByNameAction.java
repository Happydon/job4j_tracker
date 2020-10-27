package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item by Name ===");
        String key = input.askStr("Enter name: ");
        List<Item> item = tracker.findByName(key);
        if (item.size() != 0) {
            for (Item value : item) {
                out.println(value);
            }
        } else {
           out.println("Заявка по id не найдена");
        }
        return true;
    }
}
