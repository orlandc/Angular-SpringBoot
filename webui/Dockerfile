FROM node:16

ENV ROOT_WWW_PATH /var/www/html
ENV ANGULARCLI_VERSION 12.2.8

RUN apt-get update \
    && apt-get install -qq libcairo2-dev libjpeg-dev libpango1.0-dev libgif-dev librsvg2-dev build-essential g++

RUN npm install -g @angular/cli@${ANGULARCLI_VERSION} \
  && rm -rf /tmp/* ~/.npm \
  && npm cache clear --force \
  && mkdir -p /var/www/html

WORKDIR ${ROOT_WWW_PATH}
COPY . ${ROOT_WWW_PATH}

RUN npm install

EXPOSE 4200

CMD [ "sh", "-c", "ng serve --host 0.0.0.0 --disable-host-check" ]