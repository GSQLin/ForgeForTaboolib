package com.yourname.casual
import taboolib.common.platform.*
import taboolib.common.platform.function.info

object projectname : Plugin(){

    override fun onEnable() {
        info("§3Plugin loaded")
    }

    override fun onDisable() {
        info("§3Plugin disabled")
    }
}