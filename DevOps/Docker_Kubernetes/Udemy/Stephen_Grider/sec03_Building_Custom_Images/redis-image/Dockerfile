# Use an existing docker image as base
#FROM alpine
FROM ubuntu:bionic

# Downloadand install a dependency
#RUN apkadd --update redis
RUN apt-get update && apt-get install -y gcc
RUN apt-get update && apt-get install -y redis


#Tell the imagewhat to dowhen it starts as a containers
CMD ["redis-server"]
