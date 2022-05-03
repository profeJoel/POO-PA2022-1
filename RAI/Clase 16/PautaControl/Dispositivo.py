from Camara import Camara

class Dispositivo(Camara):
    
    def __init__(self, id, nombre, resolucion):
        self.id = id
        self.nombre = nombre
        self.resolucion = resolucion
        
    def transmitir(self):
        print(f">>>> Cámara {self.nombre} está transmitiendo...")