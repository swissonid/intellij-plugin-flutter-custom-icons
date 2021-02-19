package com.github.swissonid.intellijpluginfluttercustomicons.services

import com.github.swissonid.intellijpluginfluttercustomicons.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
