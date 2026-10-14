
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('04-factorial') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
