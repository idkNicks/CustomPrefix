package io.github.idknicks.customprefix.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class PrefixCmd: CommandExecutor {

    override fun onCommand(sender: CommandSender, cmd: Command, label: String, args: Array<out String>): Boolean {

        var player: Player = sender as Player

        if (sender !is Player) return true

            if(args.isEmpty()) {
                player.sendMessage("§c사용법: /칭호 장착 <칭호>")
                return true
            }

            when(args[0]) {

                "장착" -> {
                    return true;
                }

                "목록" -> {
                    return true;
                }
            }
        return false
    }
}