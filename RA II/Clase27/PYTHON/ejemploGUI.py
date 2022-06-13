import PyQt5.QtWidgets as qtw
import PyQt5.QtGui as qtg

class VentanaPrincipal(qtw.QWidget):
    def __init__(self):
        super().__init__()
        
        self.setWindowTitle("Primer GUI con PyQt5")
        self.setLayout(qtw.QVBoxLayout()) # almacena los elementos de forma vertical
        
        texto = qtw.QLabel("Cuál es tu nombre?")
        texto.setFont(qtg.QFont("Helvetica", 18))
        self.layout().addWidget(texto)
        
        nombre = qtw.QLineEdit()
        nombre.setText("Ingrese su nombre...")
        self.layout().addWidget(nombre)
        
        #boton = qtw.QPushButton("OK", clicked = lambda: print(nombre.text()))
        boton = qtw.QPushButton("OK", clicked = lambda: accion())
        self.layout().addWidget(boton)
        
        self.show()
        
        def accion():
            texto.setText(f"Hola {nombre.text()}!!!")
            nombre.setText("")

if __name__ == "__main__":
    app = qtw.QApplication([])
    ventana = VentanaPrincipal()
    
    app.exec_()