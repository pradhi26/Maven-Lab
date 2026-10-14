
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('07-reverse-number') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
