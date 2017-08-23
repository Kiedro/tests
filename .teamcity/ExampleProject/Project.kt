package ExampleProject

import ExampleProject.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "b27472da-b23b-4605-84aa-8f0131a78957"
    extId = "ExampleProject"
    parentId = "_Root"
    name = "ExampleProject"
    description = "Project for testing TC"

    buildType(ExampleProject_DevelopBuild)
})
