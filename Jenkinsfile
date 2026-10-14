
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('14-reverse-string') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
