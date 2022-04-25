import math

def distancia(dX, dY):
    return math.sqrt(dX+dY)

if __name__ == "__main__":
    cuadrado = lambda n : n**2
    delta = lambda x2,x1: x2-x1
    
    A = [1,1]
    B = [2,1]
    
    print(f"La distancia es: {distancia(cuadrado(delta(B[0], A[0])),cuadrado(delta(B[1], A[1])))}")