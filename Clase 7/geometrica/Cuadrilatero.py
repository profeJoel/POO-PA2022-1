from Coordenada import Coordenada
import math

class Cuadrilatero:

    def __init__(self):
        self.A = None
        self.B = None
        self.C = None
        self.D = None

    def __init__(self, A, B, C, D):
        if type(A) == Coordenada:
            #print("SI")
            self.A = A
        else:
            #print("NO")
        self.B = B
        self.C = C
        self.D = D

    def get_A(self):
        return self.A
    def get_B(self):
        return self.B
    def get_C(self):
        return self.C
    def get_D(self):
        return self.D

    def set_A(self, A):
        self.A = A

    def set_B(self, B):
        self.B = B

    def set_C(self, C):
        self.C = C

    def set_D(self, D):
        self.D = D

    def calcular_area(self):
        return None
        #pass

    def calcular_distancia(self, P1, P2):
        return math.sqrt((P2.get_y() - P1.get_y())**2 + (P2.get_x() - P1.get_x())**2)

    def calcular_altura(self):
        p_mas_alto = max(self.A.get_y(), self.B.get_y(), self.C.get_y(), self.D.get_y())
        p_mas_bajo = min(self.A.get_y(), self.B.get_y(), self.C.get_y(), self.D.get_y())

        return p_mas_alto - p_mas_bajo

    