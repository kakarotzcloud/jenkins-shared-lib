def call(String branch, String url, String credentialsId){
  git branch: branch, credentialsId: credentialsId, url: url
}
