def post = load "JenkinsHelper\\stagePost.groovy "


pipeline {
    agent none

    stages {
        stage('Build')
        {
            steps{
                    script {
                            echo ('build')
                            //post.runPost()
                    }
            }
        }
    }


}
