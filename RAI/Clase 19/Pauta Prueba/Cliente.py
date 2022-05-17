class Cliente:
    
    RUT: str
    nombre: str
    correo: str
    
    def __init__(self, RUT, nombre, correo):
        self.RUT = RUT
        self.nombre = nombre
        self.correo = correo
        
    def get_RUT(self):
        return self.RUT
    
    def get_nombre(self):
        return self.nombre
    
    def get_correo(self):
        return self.correo
    
    def set_RUT(self, RUT):
        self.RUT = RUT
        
    def set_nombre(self, nombre):
        self.nombre = nombre
        
    def set_correo(self, correo):
        self.correo = correo
        
    