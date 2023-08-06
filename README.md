### Clonar repositorio
```bash
git clone <urlDelRepositorio>
```

### Bajar cambios
```bash
git pull
```

### Lista de cambios
```bash
git status
```

### Agregar cambios a commit
Se puede usar * para agregar todos los archivos o todos los archivos incluidos en una carpeta
```bat
git add <nombreDeArchivo> 
git add <nombreDeCarpeta>/*
git add *
```

### Restaurar cambios
```bash
git restore --staged <nombreArchivoNuevo>
git restore <nombreArchivoModificado>
```

### Crear commit
```bash
git commit -m "<descripciónDeCommit>"
```

### Subir cambios
```bash
git push
```

### Cambiar de rama
```bash
git checkout <nombreRama>
```

### Crear rama nueva
```bash
git checkout -b <nombreRama>
```


### Pasar cambios de una rama a otra
Desde la rama la cual queremos actualizar
```bash
git merge <nombreRama>
```