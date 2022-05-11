pipeline {

  agent any
  
  stages {
  
    stage("build") {
    
      steps {
        echo 'builing app'
        withMaven(maven : 'maven_3_5_0') {
          sh "mvn clean compile"
        }
      }    
    }
    stage("test") {
    
      steps {
        echo 'testing app'
      }
    }
    stage("deploy") {
    
      steps {
        echo 'deploying app'
      }
    }
  }
}
