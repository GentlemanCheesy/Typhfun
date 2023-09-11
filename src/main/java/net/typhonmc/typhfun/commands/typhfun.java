package net.typhonmc.typhfun.commands;

import net.typhonmc.typhfun.Typhfun;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class typhfun implements TabExecutor {

    private static final String prefix = "§8[§a§lTyphfun§r§8]§f: ";
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(args.length < 1) { return false; }

        sender.sendMessage(prefix+"reloaded config");
        switch(args[0]) {
            case "reload": Typhfun.reload(true);
                           return true;
            default: return false;
        }
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        List<String> next_arguments = new ArrayList<String>();

        if( !(sender instanceof Player) ) { return next_arguments; }

        if(args.length == 1) {
            next_arguments.add("reload");
            return next_arguments;
        }

        return next_arguments;
    }
}
