#!/bin/bash
echo "Iniciando contenedor MariaDB en puerto 3308..."
docker run -it --rm -p 3308:3306 --env MARIADB_ROOT_PASSWORD=123 mariadb:noble