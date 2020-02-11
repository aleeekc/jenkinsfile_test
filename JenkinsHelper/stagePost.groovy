def runPost(){
    sh 'echo "TESTTeST"'
    return {
            sh 'echo "BYE World"'
    }
}

return this