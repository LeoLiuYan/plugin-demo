package com.github.leoliuyan.plugindemo

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory
import javax.swing.JComponent

class UISidebarConfig : ToolWindowFactory {
    private val form = UIDemo()
    private val component : JComponent
    init {
        component = form.liuyanPanel
    }

    override fun createToolWindowContent(p0: Project, p1: ToolWindow) {
        p1.contentManager.addContent(
            ContentFactory.getInstance().createContent(component, "", false)
        )
    }
}