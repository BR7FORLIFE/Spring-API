# API de Usuarios

Esta es una API de Usuarios que implementa todos los métodos HTTP y sus correspondientes códigos de estado.

## Endpoints

### Crear Usuario

**POST /usuarios**

- **Descripción:** Crea un nuevo usuario.
- **Códigos de estado:**
    - `201 Created`: Usuario creado exitosamente.
    - `400 Bad Request`: Datos de entrada inválidos.

### Obtener Usuarios

**GET /usuarios**

- **Descripción:** Obtiene una lista de todos los usuarios.
- **Códigos de estado:**
    - `200 OK`: Solicitud exitosa.

### Obtener Usuario por ID

**GET /usuarios/{id}**

- **Descripción:** Obtiene un usuario específico por su ID.
- **Códigos de estado:**
    - `200 OK`: Solicitud exitosa.
    - `404 Not Found`: Usuario no encontrado.

### Actualizar Usuario

**PUT /usuarios/{id}**

- **Descripción:** Actualiza la información de un usuario específico.
- **Códigos de estado:**
    - `200 OK`: Usuario actualizado exitosamente.
    - `400 Bad Request`: Datos de entrada inválidos.
    - `404 Not Found`: Usuario no encontrado.

### Eliminar Usuario

**DELETE /usuarios/{id}**

- **Descripción:** Elimina un usuario específico.
- **Códigos de estado:**
    - `200 OK`: Usuario eliminado exitosamente.
    - `404 Not Found`: Usuario no encontrado.

## Ejemplos de Solicitudes

### Crear Usuario

```http
POST /usuarios
Content-Type: application/json

{
    "nombre": "Juan Perez",
    "ocupacion": "ingeniero de sistemas"
}
```

### Obtener Usuarios

```http
GET /usuarios
```

### Obtener Usuario por ID

```http
GET /usuarios/1
```

### Actualizar Usuario

```http
PUT /usuarios/1
Content-Type: application/json

{
    "nombre": "Juan Perez",
    "ocupacion": "ingeniero de sistemas"
}
```

### Eliminar Usuario

```http
DELETE /usuarios/1
```

## Tecnologías Utilizadas

- SpringBoot

## Instalación

1. Clona el repositorio.
2. Ejecuta `npm install` para instalar las dependencias.
3. Configura las variables de entorno.
4. Ejecuta `npm start` para iniciar el servidor.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request para discutir cualquier cambio.

## Licencia

Este proyecto está bajo la Licencia MIT.
