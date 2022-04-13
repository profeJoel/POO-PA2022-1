from abc import ABC, abstractmethod

class Animal(ABC):
    name: str
    species: str

    @abstractmethod
    def makeSound():
        pass
