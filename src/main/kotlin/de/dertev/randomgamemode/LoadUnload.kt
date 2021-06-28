package de.dertev.randomgamemode

import de.dertev.randomgamemode.command.MainCommand
import net.axay.kspigot.main.KSpigot
import org.bukkit.Bukkit

class LoadUnload : KSpigot() {
    override fun startup() {
        getCommand("randomgamemode")!!.setExecutor(MainCommand())
        Bukkit.getConsoleSender().sendMessage("§aEnabled RandomGameMode.")
    }
    override fun shutdown() {
        Bukkit.getConsoleSender().sendMessage("§cDisabled RandomGameMode.")
    }
}
