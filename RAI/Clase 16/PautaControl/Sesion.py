from Camara import Camara
from Dispositivo import Dispositivo
from datetime import datetime

class Sesion:
    
    def __init__(self, id, nombre_asignatura, nombre_profesor, sala):
        self.id = id
        self.nombre_asignatura = nombre_asignatura
        self.nombre_profesor = nombre_profesor
        self.sala = sala
        self.fecha = datetime.today() #entrega la fecha actual
        self.hora_inicio = None
        self.hora_fin = None
        self.camara_en_uso = None
        self.cant_camaras = 0
        self.id_camara = -1
        self.lista_camaras = list()
        self.esta_transmitiendo = False
        
    def agregar_camara(self, camara):
        self.lista_camaras.append(camara)
        if self.cant_camaras == 0:
            self.camara_en_uso = self.lista_camaras[self.cant_camaras] # ocupa la primera cámara en la lista
            self.id_camara = self.cant_camaras
        self.cant_camaras += 1
        
    def iniciar_transmision(self):
        self.hora_inicio = datetime.today().time() #hora inicial -> "11:00"
        self.esta_transmitiendo = True #Si está transmitiendo
        
        #if self.esta_transmitiendo:
        #    self.camara_en_uso.transmitir()

    def terminar_transmision(self):
        self.hora_fin = datetime.today().time()
        self.esta_transmitiendo = False #termina de transmitir
        
    def cambiar_camara(self):
        print(self.cant_camaras)
        if self.cant_camaras > 1:
            self.id_camara += 1
            print(self.id_camara)
            self.camara_en_uso = self.lista_camaras[self.id_camara] # ocupa la primera cámara en la lista
    