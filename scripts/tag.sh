# Tag last commit as 'latest'.

if [ "$TRAVIS_BRANCH" = "master" -a "$TRAVIS_PULL_REQUEST" = "false" ]; then
  git config --global user.email "hi@travis-ci.org"
  git config --global user.name "Sr. Travis"

  git remote add release "https://8f1228456794fb2dddc178463abd87656685a2b3@github.com/GarrettBeatty/arXiv-eXplorer.git"

  git push -d release latest
  git tag -d latest
  git tag -a "latest" -m "[Autogenerated] This is the latest version pushed to the master branch."
  git push release --tags
fi