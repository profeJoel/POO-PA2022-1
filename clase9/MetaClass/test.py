#crear una clase FOO
class Foo:
    def __init__(self):
        self.a = 0

# instanciar esa clase en una variable x
x = Foo()
print(x.a)

#probar el tipo del objeto

print(type(x))
print(type(Foo))
print(type(type))

###########################
# Las Metaclases sirven para determinar el comportamiento de las clases
# Todas las clases son objetos de la metaclase
# Podemos cambiar la forma de trabajar POO personalizando metaclases