from Producto import Producto

class Accesorio(Producto):
    
    compatibilidad: str
    
    def __init__(self, SKU, nombre, desc, precio, stock, compatibilidad):
        self.SKU = SKU
        self.nombre = nombre
        self.descripcion = desc
        self.precio = precio
        self.stock = stock
        self.compatibilidad = compatibilidad
        
    def get_compatibilidad(self):
        return self.compatibilidad
    
    def set_compatibilidad(self, compatibilidad):
        self.compatibilidad = compatibilidad