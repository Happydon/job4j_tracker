package ru.job4j.tracker;

import java.util.Objects;

public class FindByIDAction implements UserAction {
    private final Output out;

    public FindByIDAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item by ID ===");
        int id = input.askInt("Enter ID: ");
        Item item = tracker.findById(id);
        out.println(Objects.requireNonNullElse(item, "Заявка по id не найдена"));
        return true;
    }
}
