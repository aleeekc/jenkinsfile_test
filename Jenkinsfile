def post = load "JenkinsHelper\\stagePost.groovy "


pipeline {
    agent any

    stages {
        stage('Build'){
            steps{echo ('build')}
        }
    }

    post.runPost()
}
