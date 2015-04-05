--Required for live console output
--io.stdout:setvbuf("no")
--require ("libraries.loveframes")
--require ("libraries.lovefs.lovefs")
--require ("libraries.lovefs.dialogs")
--require("libraries.cupid") -- debug library
--local inspect = require("libraries.inspect") 
--require 'libraries.light.light'

function love.load()
	msR = 255
	msG = 255
	msB = 255

	hero = {}
	hero.x = 300
	hero.y = 450
	hero.width = 30
    hero.height = 15
	hero.speed = 250
	hero.shots = {}
	hero.powerups = {}
	hero.difficulty = 1
	score = 0
	--print("Created Entity:Hero"..inspect(hero))
	enemies = {}
	enemies.speed = 0
	gameState = "play"
	createEnemies()
	--if gameState == "lightTest" then
    -- create light world
    --lightWorld = love.light.newWorld()
    --lightWorld.setAmbientColor(15, 15, 31) -- optional
    --Player = lightWorld.newLight(0, 0, msR, msG, msB, 150)
    --Player.setGlowSize(0.1) -- optional
	--end
end
function createEnemies()
	for i = 0, 7 do
		enemy = {}
		enemy.width = 40
		enemy.height = 20
		enemy.x = i * (enemy.width + 60) + 100
		enemy.y = enemy.height + 100

		print("Created Entity:Enemy"..i)
		table.insert(enemies, enemy)
	end
	for i = 7, 12 do
		enemy = {}
		enemy.width = 40
		enemy.height = 20
		enemy.x = (i - 7) * (enemy.width + 60) + 150
		enemy.y = enemy.height + 150
		print("Created Entity:Enemy"..i)
		table.insert(enemies, enemy)
	end
end

function love.update(dt)
	love.window.setTitle("" .. love.timer.getFPS() .. "")
	if gameState == "play" then -- GAMESTATE(update)
	for i,v in ipairs(enemies) do
		if i >= 1 then
			if score <= 1 then
				enemies.speed = 1
			else
	    		enemies.speed = 2^(1/2*score)
	    		print(enemies.speed .."speed")
			end
		end
	end
	if love.keyboard.isDown("left") then 
		hero.x = hero.x - hero.speed*dt
		
	end 
	if love.keyboard.isDown("right") then	
		hero.x = hero.x + hero.speed*dt 
		
	end

	for i,v in ipairs(enemies) do
    	v.y = v.y + dt*enemies.speed
    		if v.y > hero.y and i >= 1 then table.remove(enemies, i) gameState = "gameOver" end
    		if i == 0 then gameState = "winner" end

	end
	for i,v in ipairs(hero.shots) do
		v.y = v.y - dt * 150
		remShots()
		remEnemies()
	end
	end
	for i,v in ipairs(enemies) do
		if i == 0 then createEnemies() end
	end
	if gameState == "lightTest" then
		Player.setPosition(love.mouse.getX(), love.mouse.getY())
		if love.keyboard.isDown("r") then	
			msR = msR + 1
			if msR > 255 then
				msR = 0
			end
			Player.setColor(msR, msG, msB)
		end
		if love.keyboard.isDown("g") then	
			msG = msG + 1
			if msG > 255 then
				msG = 0
			end
			Player.setColor(msR, msG, msB)
		end
		if love.keyboard.isDown("b") then	
			msB = msB + 1
			if msB > 255 then
				msB = 0
			end
			Player.setColor(msR, msG, msB)
		end
	end
end

function love.draw()
	love.graphics.print("Enemy speed: "..enemies.speed, 0, 0)
	if gameState == "play" then -- GAMESTATE(Draw)
	love.graphics.setColor(0,255,0,255)
	love.graphics.rectangle("fill", 0, 465, 800, 150)

	love.graphics.setColor(255,0,0,255)
	love.graphics.rectangle("fill", hero.x, hero.y, hero.width, hero.height)
	
	love.graphics.setColor(0,255,255,255)
	for i,v in ipairs(enemies) do
    	love.graphics.rectangle("fill", v.x, v.y, v.width, v.height)
    	--lightWorld.newRectangle(v.x, v.y, v.width, v.height)
	end

	love.graphics.setColor(255,255,255,255)
	for i,v in ipairs(hero.shots) do
		love.graphics.rectangle("fill", v.x, v.y, 2, 5)
	end
	elseif gameState == "gameOver" then
		love.graphics.print("Game over", 400, 300)
	elseif gameState == "winner" then
		love.graphics.print("YOU WIN YAY?!", 400, 300)
	end
	if gameState == "lightTest" then
		    lightWorld.update()
   	 	love.graphics.setColor(255, 255, 255)
    	love.graphics.rectangle("fill", 0, 0, love.graphics.getWidth(), love.graphics.getHeight())
   	 	lightWorld.drawShadow()
   		 lightWorld.drawShine()
   		 	love.graphics.print("R: "..msR.." G: "..msG.." B: "..msB,0,15)

	end
end

function love.keypressed(key)
	if (key == "q") then
		love.event.quit()
		print("quitting")
	end
	if (key == "f11") then
		if love.window.getFullscreen() then love.window.setFullscreen(false) else love.window.setFullscreen(true) end
		print("fullscreen")
	end 
	if (key == "s") then
		print(gameState)
		Player.setColor(msR, msG, msB)
	end
	if (key == "h") then
		if gameState == "play" then gameState = "lightTest" else gameState = "play"
		love.load()
		end
	end
	if (key == " ") then
		shoot()
		shoot()
		shoot()
		for i,v in ipairs(hero.shots) do
			--print(inspect(v)..i)
		end
    end
end

function love.keyreleased(key)

end
function love.mousepressed(x, y, button)
   if button == 'l' then
      print("x: "..x.."||y: "..y)
   end
end
function shoot()
	local shot = {}
	shot.x = hero.x + hero.width/2
	shot.y = hero.y
	table.insert(hero.shots, shot)
	print("I shot my gun")
end

function remShots()
	local remShot = {}
	for i,v in ipairs(hero.shots) do
		if v.y < 0 then
			table.insert(remShot, i)
			print("Removing shot "..i)
			for i,v in ipairs (remShot) do
				table.remove(hero.shots, v)
			end
		end
	end
end


function remEnemies()
	local remEnemy = {}
	for i,v in ipairs(hero.shots) do
		for j,k in ipairs(enemies) do
			if k.y > v.y then
				if CheckCollision(v.x, v.y, 2, 5, k.x, k.y, k.width, k.height) then
					table.insert(remEnemy, j)
					table.remove(hero.shots, i)
					score = score + 1
					hero.difficulty = hero.difficulty * score * (0.25 * score)
					--debug
					print("Difficulty"..hero.difficulty)
					print("Score"..score)
				end
			end
		end
	end
	for i,v in ipairs(remEnemy) do
		table.remove(enemies, v)
	end 
end

function CheckCollision(x1,y1,w1,h1, x2,y2,w2,h2)
  return x1 < x2+w2 and
         x2 < x1+w1 and
         y1 < y2+h2 and
         y2 < y1+h1
end

function difficultyIncrease(score)

end