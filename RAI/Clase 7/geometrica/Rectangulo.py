from Coordenada import Coordenada
from Cuadrilatero import Cuadrilatero

class Rectangulo(Cuadrilatero):
    def __init__(self, A, B, C, D):
        super().__init__(A,B,C,D)

    def calcular_area(self):
        Largo = self.calcular_altura()
        Ancho = self.calcular_ancho()

        return Largo * Ancho

    def calcular_ancho(self):
        p_mas_derecha = max(self.A.get_x(), self.B.get_x(), self.C.get_x(), self.D.get_x())
        p_mas_izquierda = min(self.A.get_x(), self.B.get_x(), self.C.get_x(), self.D.get_x())

        return p_mas_derecha - p_mas_izquierda