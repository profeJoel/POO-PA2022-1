from Animal import Animal

class Cat(Animal):
    def __init__(self, name, species, claws):
        self.name = name
        self.species = species
        self.claws = claws

    def makeSound(self):
        print("Miauuu!")