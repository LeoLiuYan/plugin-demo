package com.github.leoliuyan.plugindemo


import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.options.Configurable
import javax.swing.JComponent
import com.github.leoliuyan.plugindemo.UIDemoStat
import com.intellij.openapi.project.Project

class UISettingsConfig: Configurable {

    private val form = UIDemo()
    private val component : JComponent

    private val state = ApplicationManager.getApplication().getService(UIDemoStat::class.java)
    init {
        component = form.liuyanPanel
        reset()
    }
    override fun createComponent() = component

    override fun isModified() : Boolean {
        return state.username != form.username.text || state.password != form.password.text
    }

    override fun apply() {
        state.username = form.username.text
        state.password = form.password.text
    }

    override fun reset() {
        form.username.text = state.username
        form.password.text = state.password
    }

    override fun getDisplayName(): String {
        return "UISettingsConfig"
    }
}