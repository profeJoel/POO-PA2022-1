from Mouse import Mouse

class Cat:
    #Los atributos no son necesario de describir
    #Se describen en el constructor __init__()
    def __init__(self, id, name, sex, age, weight, color, texture):
        self.__id = id
        self.__name = name
        self.__sex = sex
        self.__age = age
        self.__weight = weight
        self.__color = color
        self.__texture = texture
    
    def eat(self):
        print(self.__name + " esta comiendo...")
    
    def move(self, direction):
        print(self.__name + " se mueve a " + direction)

    def meow(self):
        print(self.__name + "Dice Meow!")

    def purr(self):
        print(self.__name + "Dice Purr!")

    def hunt_mice(self, hunted):
        print(self.__name + " Cazó a " + hunted.get_name())
        return hunted

    #Getter y Setter

    def get_name(self):
        return self.__name

    def get_color(self):
        return self.__color

    def set_color(self, nuevo_color):
        colores = ["negro", "rojo", "orange", "gris", "blanco", "marrón"]
        """
        for color in colores:
            if color == nuevo_color:
                self.__color = nuevo_color
                print("Color modificado con éxito")
                nuevo_color = None
        if nuevo_color != None:
            print("El color no está disponible para realizar el cambio")
        """
        if nuevo_color in colores:
            self.__color = nuevo_color
            print("Color modificado con éxito")
        else:
            print("El color no está disponible para realizar el cambio")

