package ExampleProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object ExampleProject_DevelopBuild : BuildType({
    uuid = "987477df-63d2-479b-9a38-9d1215120cf2"
    extId = "ExampleProject_DevelopBuild"
    name = "DevelopBuild"

    steps {
        powerShell {
            name = "Fist Step"
            scriptMode = script {
                content = "ls"
            }
        }
    }
})
