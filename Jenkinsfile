def post = load "JenkinsHelper\\stagePost.groovy "


pipeline {
    agent any

    stages {
        stage('Build')
        {
            steps{
                    script {
                            echo ('build')
                            post.runPost()
                    }
            }
        }
    }


}
