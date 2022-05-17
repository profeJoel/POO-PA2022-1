from abc import ABC, abstractmethod

class Producto(ABC):
    SKU: int
    nombre: str
    descripcion: str
    precio: float
    stock: int
    
    def get_SKU(self) -> int:
        return self.SKU
    
    def get_nombre(self) -> str:
        return self.nombre
    
    def get_descripcion(self) -> str:
        return self.descripcion
    
    def get_precio(self) -> float:
        return self.precio
    
    def get_stock(self) -> int:
        return self.stock
    
    def set_SKU(self, sku):
        self.SKU = sku
        
    def set_nombre(self, nombre):
        self.nombre = nombre
        
    def set_descripcion(self, desc):
        self.descripcion = desc
        
    def set_precio(self, precio):
        self.precio = precio
        
    def set_stock(self, stock):
        self.stock = stock
        