job('NodeJS example') {
    scm {
        git('https://github.com/42Matt/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('42Matt')
            node / gitConfigEmail('45406097+42Matt@users.noreply.github.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
