# Importa la libreria PIL

from random import randint
from tkinter import Image

# Crea un'immagine vuota di 600x600 pixel
img = Image.new('RGB', (600, 600), color = 'white')

# Ottieni l'oggetto draw per disegnare sull'immagine
draw = ImageDraw.Draw(img)

# Genera forme e colori casuali
for i in range(100):
  x1 = randint(0, 600)
  y1 = randint(0, 600)
  x2 = randint(0, 600)
  y2 = randint(0, 600)
  color = (randint(0, 255), randint(0, 255), randint(0, 255))
  draw.line((x1, y1, x2, y2), fill=color, width=1)

# Salva l'immagine generata
img.save('random.png')
