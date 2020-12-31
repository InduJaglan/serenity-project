pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        build(propagate: true, quietPeriod: 5, job: 'serenity-test', wait: true)
      }
    }

    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            echo 'Started testing'
          }
        }

        stage('Chrome') {
          steps {
            bat 'mvn clean verify'
          }
        }

      }
    }

  }
}