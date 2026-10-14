
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('01-addition-two-numbers') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
