package ru.sonicxd2.testfp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import ru.sonicxd2.testfp.paladin.PaladinStatusStateMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerCustomActionManager {
    private Map<String, PlayerAction> actions = new HashMap<>();

    public void init(JavaPlugin plugin) {
        actions.put("гладить", PlayerAction.GLADITB);
        actions.put("япаладин", _1 -> {
            PaladinStatusStateMachine statusStateMachine = new PaladinStatusStateMachine(plugin);
            statusStateMachine.nextStatus();
        });
        actions.put("suicide", PlayerAction.KILL);

        plugin.getCommand("action").setExecutor((sender, command, label, args) -> {
            if (args.length > 0) {
                String action = args[0];
                PlayerAction playerAction = actions.get(action);
                if (playerAction != null) {
                    playerAction.apply((Player) sender);
                } else {
                    sender.sendMessage("Ты додик.");
                }
            }
            return true;
        });

        plugin.getCommand("action").setTabCompleter(new TabCompleter() {
            @Override
            public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
                return new ArrayList<>(actions.keySet());
            }
        });
    }
}
