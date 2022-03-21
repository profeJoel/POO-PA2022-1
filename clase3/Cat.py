from Mouse import Mouse

class Cat:
    #Los atributos no son necesario de describir
    #Se describen en el constructor __init__()
    def __init__(self, id, name, sex, age, weight, color, texture):
        self.id = id
        self.name = name
        self.sex = sex
        self.age = age
        self.weight = weight
        self.color = color
        self.texture = texture
    
    def eat(self):
        print(self.name + " esta comiendo...")
    
    def move(self, direction):
        print(self.name + " se mueve a " + direction)

    def meow(self):
        print(self.name + "Dice Meow!")

    def purr(self):
        print(self.name + "Dice Purr!")

    def hunt_mice(self, hunted):
        print(self.name + " Cazó a " + hunted.name)
        return hunted
