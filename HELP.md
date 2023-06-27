build app:
./gradlew build

build image:
nerdctl build -t demo/demoapp .
nerdctl build -t demo/demoapp2 .

check images
nerdctl images

run image:
nerdctl run -d -p 8100:8080 demo/demoapp
nerdctl run -d -p 8101:8080 demo/demoapp2

check running containers:
nerdctl ps


access container: nerdctl exec -it CONTAINER-ID /bin/sh
tail: tail -f logs/demo.log

nginx:
nerdctl run -d -p 8000:80 nginx