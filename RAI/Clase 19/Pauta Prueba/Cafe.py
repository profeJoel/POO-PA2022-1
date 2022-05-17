from asyncio import SendfileNotAvailableError
from Producto import Producto

class Cafe(Producto):
    
    origen: str
    aroma: str
    acidez: str
    peso: int
    
    def __init__(self, SKU, nombre, desc, precio, stock, origen, aroma, acidez, peso):
        self.SKU = SKU
        self.nombre = nombre
        self.descripcion = desc
        self.precio = precio
        self.stock = stock
        self.origen = origen
        self.aroma = aroma
        self.acidez = acidez
        self.peso = peso
        
    def get_origen(self):
        return self.origen
    
    def get_aroma(self):
        return self.aroma
    
    def get_acidez(self):
        return self.acidez
    
    def get_peso(self):
        return self.peso
    
    def set_origen(self, origen):
        self.origen = origen
        
    def set_aroma(self, aroma):
        self.aroma = aroma
        
    def set_acidez(self, acidez):
        self.acidez = acidez
        
    def set_peso(self, peso):
        self.peso = peso
        