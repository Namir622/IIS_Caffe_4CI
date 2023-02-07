import turtle

# Crea una nuova tartaruga
t = turtle.Turtle()

# Imposta la velocità di disegno (1-10)
t.speed(10)

# Disegna la testa di Spider-Man
t.circle(50)

# Sposta la tartaruga in posizione per disegnare gli occhi
t.penup()
t.setposition(-20, 60)
t.pendown()

# Disegna gli occhi di Spider-Man
t.circle(10)
t.penup()
t.setposition(20, 60)
t.pendown()
t.circle(10)

# Sposta la tartaruga in posizione per disegnare la bocca
t.penup()
t.setposition(-30, 40)
t.pendown()

# Disegna la bocca di Spider-Man
t.circle(20, 180)

# Sposta la tartaruga in posizione per disegnare le ragnatele
t.penup()
t.setposition(-80, 0)
t.pendown()

# Disegna le ragnatele di Spider-Man
t.forward(160)
t.backward(80)
t.left(90)
t.forward(80)
t.backward(160)
t.right(90)

# Sposta la tartaruga in posizione per disegnare le gambe
t.penup()
t.setposition(-30, -50)
t.pendown()

# Disegna le gambe di Spider-Man
t.right(45)
t.forward(70)
t.backward(70)
t.left(90)
t.forward(70)
t.backward(70)

# Sposta la tartaruga in posizione per disegnare le braccia
t.penup()
t.setposition(-70, -10)
t.pendown()

# Disegna le braccia di Spider-Man
t.left(45)
t.forward(70)
t.backward(70)
t.right(90)
t.forward(70)
t.backward(70)

# Nasconde la tartaruga
t.hideturtle()

# Mostra il disegno
turtle.done()
