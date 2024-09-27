
dev GITSYNC_WORKDIR='C:/gitsync/git_local/src/cf/'
dev GITSYNC_STORAGE_PATH='C:/gitsync/master'
dev GITSYNC_REPO_URL='https://github.com/moav1c/test/tree/main'
dev GITSYNC_STORAGE_USER='deploy'
//dev GITSYNC_STORAGE_PWD=
dev GITSYNC_REMOTE_PUSH=true
dev GITSYNC_REMOTE_PULL=true
gitsync sync -u ${GITSYNC_STORAGE_USER} -P -G ${GITSYNC_STORAGE_PATH} ${GITSYNC_WORKDIR} ${GITSYNC_REPO_URL}
