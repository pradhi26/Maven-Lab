
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('11-sum-array') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
