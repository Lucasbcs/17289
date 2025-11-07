FROM alpine
EXPOSE 80
RUN apk add nginx 
COPY ./ordinario-ftw /var/lib/nginx/html/
COPY ./Lucas.conf /etc/nginx/http.d/default.conf
RUN nginx 
CMD ["nginx", "-g", "daemon off;"]
#-g 'daemon off;'