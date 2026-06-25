FROM eclipse-temurin:latest

VOLUME ["/code"]

WORKDIR /code

CMD ["bash"]

# docker build -t java .
# docker run --rm -it -v "$PWD/AvajLauncher":/code java