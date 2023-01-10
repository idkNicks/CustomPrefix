package io.github.idknicks.customprefix

import com.github.nicklib.data.Config
import io.github.idknicks.customprefix.command.PrefixCmd
import io.github.idknicks.customprefix.listener.AsyncPlayerChatListener
import io.github.idknicks.customprefix.listener.PlayerInteractListener
import org.bukkit.plugin.java.JavaPlugin

class Plugin: JavaPlugin() {

    companion object {
        var instance: Plugin? = null
        var config: Config? = null
    }

    override fun onEnable() {
        init()
    }

    /** 모듈을 관리합니다. */
    private fun init() {

        /** COMMAND */
        getCommand("prefix")?.setExecutor(PrefixCmd())

        /** EVENT */
        server.pluginManager.registerEvents(AsyncPlayerChatListener(), this)
        server.pluginManager.registerEvents(PlayerInteractListener(), this)

        /** CONFIG */
        instance = this
        Plugin.config = Config("config", this)
        Plugin.config!!.loadDefaultConfig()
    }
}