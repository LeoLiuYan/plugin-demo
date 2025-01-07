package com.github.leoliuyan.plugindemo

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil

@Service
@State(name = "UIDemoStat", storages = [Storage("ui-demo-stat.xml")])
class UIDemoStat: PersistentStateComponent<UIDemoStat> {
    var username = ""
    var password = ""

    override fun getState(): UIDemoStat {
        return this
    }

    override fun loadState(state: UIDemoStat) {
        XmlSerializerUtil.copyBean(state, this)
    }
}