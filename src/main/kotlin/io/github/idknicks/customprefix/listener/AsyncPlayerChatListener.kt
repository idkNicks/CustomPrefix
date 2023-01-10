package io.github.idknicks.customprefix.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

class AsyncPlayerChatListener: Listener {


    /**
     * 플레이어가 채팅을 쳤을 때 접두사를 붙여줍니다.
     * @param event AsyncPlayerChatEvent
     */
    @EventHandler
    fun onChat(event: AsyncPlayerChatEvent) {

    }
}