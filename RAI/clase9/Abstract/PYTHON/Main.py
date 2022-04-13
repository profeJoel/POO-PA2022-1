from Animal import Animal
from Dog import Dog
from Cat import Cat

def main():
    firulais = Dog("Firulais", "Golden Terrier", "Mucho")
    juanito = Cat("Juanito", "Angora", "negras")

    firulais.makeSound()
    juanito.makeSound()

    ##algun = Animal()
    ##algun.makeSound()


if __name__ == "__main__":
    main()