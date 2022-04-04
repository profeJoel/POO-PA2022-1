from Coordenada import Coordenada
from Cuadrilatero import Cuadrilatero

class Trapecio(Cuadrilatero):
    def __init__(self, A, B, C, D):
        super().__init__(A,B,C,D)

    def calcular_area(self):
        AB = self.calcular_distancia(self.A,self.B)
        CD = self.calcular_distancia(self.C,self.D)
        h = self.calcular_altura()

        return ((AB + CD)*h)/2