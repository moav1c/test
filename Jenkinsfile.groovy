def cmd(command) {
    if (isUnix()) { sh "${command}" } else { bat "@chcp 65001\n${command}"}
}
env.LOGOS_CONFIG='logger.rootLogger=DEBUG'
env.GITSYNC_WORKDIR='C:/gitsync/git_local/src/cf/'
env.GITSYNC_TEMP='C:/gitsync/temp'
env.GITSYNC_STORAGE_PATH='C:/gitsync/master'
env.GITSYNC_REPO_URL='https://github.com/moav1c/test/tree/main.git'
env.GITSYNC_STORAGE_USER='deploy'
//env.GITSYNC_STORAGE_PWD=
env.GITSYNC_REMOTE_PUSH='true'
env.GITSYNC_REMOTE_PULL='true'
env.GITSYNC_VERBOSE=true 
//env.GITSYNC_REMOTE_PUSH_N_COMMITS=2
env.GITSYNC_IB_CONNECTION= '/Slocalhost/convertation'
env.GITSYNC_IB_USR=''
env.GITSYNC_VERBOSE= 'true'
env.GITSYNC_V8VERSION='8.3.15.1958'
    
pipeline {
    agent any

    stages {
        stage('Конвертация хранилища в git') {
            steps {              
                //cmd("C:/Program^ Files/OneScript/bin/gitsync.bat s")
                cmd("gitsync plugins init")
                cmd("gitsync plugins enable sync-remote")
                cmd("gitsync plugins list")
                cmd("gitsync sync")
            }
        }
    }
}
