class OuterClass:
    #atributos
    class InnerClass:
        #atributos
        #metodos
        def __init__(self):
            print("Crea un objeto de la clase InnerClass\n")
            self.y = 5

    #metodos
    def __init__(self):
        print("Crea un objeto de la clase OuterClass\n")
        self.x = 10