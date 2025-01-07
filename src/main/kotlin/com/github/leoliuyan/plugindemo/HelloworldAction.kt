package com.github.leoliuyan.plugindemo

import com.intellij.codeInsight.hint.HintManager
import com.intellij.notification.Notifications
import com.intellij.notification.Notification
import com.intellij.notification.NotificationAction
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.ui.Messages


class HelloworldAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        e.getData(PlatformDataKeys.EDITOR)?.let {
            HintManager.getInstance().showInformationHint(it, "Information")
        }
    }
}