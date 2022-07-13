package cn.xiexilin.top.hat.hat.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HatCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "你不是玩家,怎么设置呢 :(");
            return true;
        }
        Player p=(Player)sender;
        ItemStack item= p.getInventory().getItemInMainHand();
        if (item == null || item.getType().isAir()) {
            sender.sendMessage(ChatColor.RED + "你手上是空气哦 :(");
            return true;
        }
        ItemStack helmetitem= p.getInventory().getHelmet();
        p.getInventory().setHelmet(item);
        p.getInventory().removeItem(item);
        p.getInventory().setItemInMainHand(helmetitem);
        p.sendMessage(ChatColor.GREEN + "已成功设置您的帽子为" + item.getItemMeta().getDisplayName());
        return false;
    }
}
