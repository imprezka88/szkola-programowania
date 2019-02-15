package pl.coderslab.app;

import java.util.HashMap;
import java.util.Map;

public enum MenuAction {
    ADD("add"),
    EDIT("edit"),
    DELETE("delete"),
    QUIT("quit");

    private static Map<String, MenuAction> name2menuAction = new HashMap<>();

    static {
        for (MenuAction menuAction : values()) {
            name2menuAction.put(menuAction.name, menuAction);
        }
    }

    private String name;

    MenuAction(String name) {
        this.name = name;
    }

    public static MenuAction getByName(String name) {
        if (name2menuAction.containsKey(name))
            return name2menuAction.get(name);

        throw new RuntimeException("Unsupported menu action: " + name);
    }

    public String getName() {
        return name;
    }
}
