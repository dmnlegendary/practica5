#Superclase general de modelos Ferris
class Ferris:
    def __init__(self):
        self.llantas = 4

#Constructor de Portos
class Portos(Ferris):
    def __init__(self):
        self.trailer = []

#Método que permite ir apilando los carros
    def guardar(self, placa):
        self.trailer.append(placa)

#Método que descarga los carros del trailer
    def sacar(self):
        contador = 0
        while (contador<10):
            print("Los elementos de la pila: ", self.trailer)
            self.trailer.pop() #Sacamos el último carro
            contador = contador + 1

#Método que permite conocer el tamaño de la pila
    def size(self):
        return len(self.trailer)

#Constructor de Celebrian
class Celebrian(Ferris):
    def __init__(self):
        self.trailer = []

#Método que permite ir encolando los carros
    def guardar(self, placa):
        self.trailer.append(placa)

#Método que descarga los carros del trailer
    def sacar(self):
        contador = 0
        while (contador<10):
            print("Elementos de la Cola: ", self.trailer)
            self.trailer.pop(0) #Saca al primer elemento de la cola
            contador = contador + 1

#Método que permite obtener el tamaño de la cola
    def size(self):
        return len(self.trailer)
    
#Declaracion de objetos y variables a emplear
sedan = Celebrian()
coupe = Portos()
placa = None
menu = True #Controlara el menu

#Este ciclo actua cómo el menu de control
while(menu==True):
    #Lectura de una placa ingresada por el usuario
    placa = input("Ingrese la placa porfavor: ")
    #print("hay: ", len(placa), " letras.")

    #Casos posibles dada la información de placa por el usuario
    if (placa[0]=='C' and sedan.size()<10 and len(placa)==7):
        sedan.guardar(placa)
        print("Elementos de la Cola: ", sedan.trailer)
        print()
    elif (sedan.size()>=10):
        sedan.sacar()
        print("Trailer de Celebrians descargado.")
        print()
    elif (placa[0]=='P' and coupe.size()<10 and len(placa)==7):
        coupe.guardar(placa)
        print("Elementos de la Pila: ", coupe.trailer)
        print()
    elif (coupe.size()>=10):
        coupe.sacar()
        print("Trailer de Portos descargado.")
        print()
    elif (placa=="NO"):
        menu = False #Finalizará el menu
    else:
        print("Placa erronea, ingrese otra.")
        print()

print("Programa finalizado")