
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('02-even-odd') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
