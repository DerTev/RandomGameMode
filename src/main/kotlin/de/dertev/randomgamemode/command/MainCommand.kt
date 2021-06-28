package de.dertev.randomgamemode.command

import org.bukkit.GameMode
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class MainCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val random: Int = (0..3).random()
        if (sender !is Player) {
            sender.sendMessage("§cYou must be a Player to use this command!")
            return true
        }
        if (random.equals(0)) {
            sender.gameMode = GameMode.SURVIVAL
            sender.sendMessage("§aYou are now in Survival-Mode!")
        } else if (random.equals(1)) {
            sender.gameMode = GameMode.CREATIVE
            sender.sendMessage("§aYou are now in Creative-Mode!")
        } else if (random.equals(2)) {
            sender.gameMode = GameMode.ADVENTURE
            sender.sendMessage("§aYou are now in Adventure-Mode!")
        } else if (random.equals(3)) {
            sender.gameMode = GameMode.SPECTATOR
            sender.sendMessage("§aYou are now in Spectator-Mode!")
        } else {
            sender.sendMessage("§cError. Please Report this to DerTev!")
        }
        return true
    }
}