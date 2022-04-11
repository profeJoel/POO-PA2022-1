from Animal import Animal

class Dog(Animal):
    def __init__(self, name, species, pedigree):
        self.name = name
        self.species = species
        self.pedigree = pedigree

    def makeSound(self):
        print("Woof!")