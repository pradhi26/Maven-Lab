
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('10-student-grade') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
