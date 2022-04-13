from OuterClass import OuterClass

def main():
    #CRea el objeto de la clase OuteClass
    A = OuterClass()
    print(A.x)

    #Crea e objeto de la clase InnerCLass
    B = A.InnerClass()
    print(B.y)

if __name__ == "__main__":
    main()