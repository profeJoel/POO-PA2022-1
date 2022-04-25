from Divisa import Divisa

class Moneda(Divisa):
    
    def __init__(self, nombre, pais, ref):
        self.nombre = nombre
        self.pais = pais
        self.ref = ref
        
    def get_nombre(self):
        return self.nombre
    
    def get_pais(self):
        return self.pais
    
    def get_ref(self):
        return self.ref
    
    def cambiar_por(self, monto, divisa):
        a_dolar = divisa.get_ref() * monto
        cambio = self.get_ref()/ a_dolar
        return cambio
        