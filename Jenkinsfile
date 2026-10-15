
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('06-fibonacci-series') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
