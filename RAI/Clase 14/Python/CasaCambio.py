from Divisa import Divisa
from Moneda import Moneda

if __name__ == "__main__":
    dolar = Moneda("usd", "USA", 1)
    euro = Moneda("eur", "EU", 0.93)
    libra = Moneda("libra", "UK", 0.78)
    peso = Moneda("clp", "Chile", 845)
    
    monto = 1
    print(f"> {monto} {dolar.get_nombre()} son {peso.cambiar_por(monto,dolar)} {peso.get_nombre()}:")