from Coordenada import Coordenada
from Cuadrilatero import Cuadrilatero
from Trapecio import Trapecio
from Rectangulo import Rectangulo
from Cuadrado import Cuadrado

def ingresar_coordenada():
    print("Ingrese Coordenada X: ")
    x = int(input())
    print("Ingrese Coordenada y: ")
    y = int(input())

    coor = Coordenada(x,y)
    print(coor)
    print(type(coor))
    return coor

def crear_trapecio():
    print("Ingrese los datos del Trapecio")
    A = ingresar_coordenada()
    B = ingresar_coordenada()
    C = ingresar_coordenada()
    D = ingresar_coordenada()

    return Trapecio(A,B,C,D)


def crear_rectangulo():
    print("Ingrese los datos del Rectangulo")
    A = ingresar_coordenada()
    B = ingresar_coordenada()
    C = ingresar_coordenada()
    D = ingresar_coordenada()

    return Rectangulo(A,B,C,D)

    
def crear_cuadrado():
    print("Ingrese los datos del Cuadrado")
    A = ingresar_coordenada()
    B = ingresar_coordenada()
    C = ingresar_coordenada()
    D = ingresar_coordenada()

    return Cuadrado(A,B,C,D)

def main():
    figura_T = crear_trapecio()
    figura_R = crear_rectangulo()
    figura_C = crear_cuadrado()

    print("El área del Trapecio es: " + str(figura_T.calcular_area()))
    print("El área del Rectangulo es: " + str(figura_R.calcular_area()))
    print("El área del Cuadrado es: " + str(figura_C.calcular_area()))


if __name__ == "__main__":
    main()