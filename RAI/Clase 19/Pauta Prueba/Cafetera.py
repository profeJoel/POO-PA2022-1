from Producto import Producto

class Cafetera(Producto):
    
    tipo: str
    capacidad: float
    material: str
    
    def __init__(self, SKU, nombre, desc, precio, stock, tipo, capacidad, material):
        self.SKU = SKU
        self.nombre = nombre
        self.descripcion = desc
        self.precio = precio
        self.stock = stock
        
        self.tipo = tipo
        self.capacidad = capacidad
        self.material = material
        
    def get_tipo(self):
        return self.tipo
    
    def get_capacidad(self):
        return self.capacidad
    
    def get_material(self):
        return self.material
    
    def set_tipo(self, tipo):
        self.tipo = tipo
        
    def set_capacidad(self, capacidad):
        self.capacidad = capacidad
        
    def set_material(self, material):
        self.material = material
        