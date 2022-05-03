from abc import ABC, abstractmethod

class Camara(ABC):
    
    @abstractmethod
    def transmitir(self):
        pass