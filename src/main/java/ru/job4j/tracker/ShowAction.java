package ru.job4j.tracker;

import java.util.List;

public class ShowAction implements UserAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show All Items ===");
        List<Item> item = tracker.findAll();
        for (int i = 0; i < item.size(); i++) {
            out.println(item.get(i));
        }
        return true;
    }
}
