import pygame
 
pygame.init()
 
white = (255, 255, 255)
black = (0, 0, 0)
red = (255, 0, 0)
 
dis = pygame.display.set_mode((800, 600))
pygame.display.set_caption('Snake Game by Edureka')
 
game_over = False
 
x1 = 300
y1 = 300
 
x1_change = 0       
y1_change = 0
 
clock = pygame.time.Clock()
 
while not game_over:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            game_over = True
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_
