from abc import ABC, abstractmethod

class Divisa(ABC):
    
    @abstractmethod
    def cambiar_por(self, monto, divisa):
        pass