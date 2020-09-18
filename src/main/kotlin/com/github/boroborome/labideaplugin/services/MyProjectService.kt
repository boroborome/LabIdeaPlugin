package com.github.boroborome.labideaplugin.services

import com.intellij.openapi.project.Project
import com.github.boroborome.labideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
