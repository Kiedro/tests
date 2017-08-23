package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object HttpsGithubComKiedroTestsGit : GitVcsRoot({
    uuid = "efa02c02-09d9-4a3f-af01-b82a4e90f38c"
    extId = "HttpsGithubComKiedroTestsGit"
    name = "https://github.com/Kiedro/tests.git"
    url = "https://github.com/Kiedro/tests.git"
    authMethod = password {
        userName = "Kiedro"
        password = "credentialsJSON:bd7ba4d3-b7c1-43a2-8e33-4846288ab7c7"
    }
})
