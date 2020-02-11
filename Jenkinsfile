
pipeline {
    agent any
    stages {
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
                        post.step()
                }
            }
        }
    }
}
