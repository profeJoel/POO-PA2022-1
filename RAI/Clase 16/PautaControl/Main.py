
from Camara import Camara
from Dispositivo import Dispositivo
from Sesion import Sesion

if __name__ == "__main__":
    
    clase1 = Sesion(1, "POO", "profe", "Lab")
    clase1.agregar_camara(Dispositivo(1, "Canon", "4k"))
    clase1.agregar_camara(Dispositivo(2, "Panasonic", "2K"))
    clase1.agregar_camara(Dispositivo(3, "Logitec", "1080p"))
    
    
    programa_funcionando = True
    
    while programa_funcionando:
        
        if clase1.esta_transmitiendo:
            clase1.camara_en_uso.transmitir()
        
        print("Bienvenido a la clase...\n")
        print("- Marque 1 para iniciar la clase\n")
        print("- Marque 2 para terminar la clase\n")
        print("- Marque 3 para cambiar la camara\n")
        print("- Marque 4 para terminar programa\n")
        opcion = int(input())
        
        if opcion == 1:
            clase1.iniciar_transmision()
        elif opcion == 2:
            clase1.terminar_transmision()
            programa_funcionando = False
        elif opcion == 3:
            clase1.cambiar_camara()
        elif opcion == 4:
            programa_funcionando = False
        else: 
            print("opción inválida!\n")