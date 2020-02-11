def generateStage(bar) {
    return {
        stage("Build bar") {
            echo "Building for foo"
        }
    }
}

pipeline {
    agent any
    stages {
        generateStage()
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
                script {
                        def post = load "${workspace}/JenkinsHelper/stagePost.groovy"
                        post.runPost()
                }
            }
        }
    }
}
