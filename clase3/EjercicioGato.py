from Cat import Cat
from Mouse import Mouse

if __name__ == "__main__":
    oscar = Cat(1,"Óscar", "macho", 3, 7, "marrón", "rayado")
    luna = Cat(2,"Luna", "hembra", 2, 5, "gris", "lisa")

    print("Tengo dos gatos: " + oscar.name + " y " + luna.name)

    oscar.eat()
    luna.meow()

    jerry = Mouse("Jerry")
    speedy = Mouse("Speedy")

    oscar.hunt_mice(jerry)
    luna.hunt_mice(speedy)