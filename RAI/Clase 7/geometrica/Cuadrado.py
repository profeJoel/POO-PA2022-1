from Coordenada import Coordenada
from Cuadrilatero import Cuadrilatero

class Cuadrado(Cuadrilatero):
    def __init__(self, A, B, C, D):
        super().__init__(A,B,C,D)

    def calcular_area(self):
        Largo = self.calcular_altura()

        return Largo**2