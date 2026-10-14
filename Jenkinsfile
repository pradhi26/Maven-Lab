
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('09-simple-interest') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
