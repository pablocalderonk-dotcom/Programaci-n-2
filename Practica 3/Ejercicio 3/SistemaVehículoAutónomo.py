# --- todo en un solo archivo ---

class Sensor:
    tipo = "Genérico"

    def __init__(self, id, **kwargs):
        super().__init__(**kwargs)
        self.id = id
        self.encendido = False

    def activar(self):
        self.encendido = True
        print(f"{self.tipo} {self.id}: activado")

    def desactivar(self):
        self.encendido = False
        print(f"{self.tipo} {self.id}: desactivado")

class Camara(Sensor):
    tipo = "Cámara"

    def __init__(self, id, resolucion, **kwargs):
        super().__init__(id=id, **kwargs)
        self.resolucion = resolucion

class SensorLuzLaser(Sensor):
    tipo = "Luz Laser"

    def __init__(self, id, alcance, **kwargs):
        super().__init__(id=id, **kwargs)
        self.alcance = alcance

class VehiculoAutonomo(Camara, SensorLuzLaser):
    tipo = "Vehículo Autónomo"

    def __init__(self, id, resolucion, alcance):
        super().__init__(id=id, resolucion=resolucion, alcance=alcance)

# --- parte del main ---

sensor = Sensor("S-001")
c1 = Camara("C-001", "1920x1080")
c2 = Camara("C-002", "3840x2160")
laser = SensorLuzLaser("L-001", 150)
vehiculo = VehiculoAutonomo("V-001", "3840x2160", 200)

print("--- Atributos de clase: tipo ---")
print("Sensor.tipo:", Sensor.tipo)
print("Camara.tipo:", Camara.tipo)
print("SensorLuzLaser.tipo:", SensorLuzLaser.tipo)
print("VehiculoAutonomo.tipo:", VehiculoAutonomo.tipo)

print()
print("--- Atributos de instancia ---")
print("c1 -> id:", c1.id, "| resolucion:", c1.resolucion, "| encendido:", c1.encendido)
print("c2 -> id:", c2.id, "| resolucion:", c2.resolucion, "| encendido:", c2.encendido)
print("c1.tipo:", c1.tipo, "| c2.tipo:", c2.tipo)

print()
print("--- VehiculoAutonomo (herencia multiple) ---")
print("id:", vehiculo.id)
print("encendido:", vehiculo.encendido)
print("resolucion:", vehiculo.resolucion)
print("alcance:", vehiculo.alcance)
print("tipo:", vehiculo.tipo)

print()
print("--- activar() y desactivar() ---")
sensores = [sensor, c1, c2, laser, vehiculo]

for s in sensores:
    s.activar()

print("vehiculo encendido:", vehiculo.encendido)

for s in sensores:
    s.desactivar()

print("vehiculo encendido:", vehiculo.encendido)

print()
print(VehiculoAutonomo.__mro__)