# Specify a base image
FROM node:alpine
#FROM ubuntu:bionic

WORKDIR /usr/app

# Install some depenendencies
COPY ./package.json ./
RUN npm install
COPY ./ ./
#RUN apt-get update && apt-get i
#RUN curl -sL https://deb.nodesource.com/setup_8.x | bash -
#RUN apt-get update && apt-get install -y nodejs

# Default command
CMD ["npm", "start"]

