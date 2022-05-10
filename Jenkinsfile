pipeline {

  agent  any
  
  stages {
  
    stage("build") {
    
      steps {
        echo 'builing app'
        sh "mvn clean install"
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
