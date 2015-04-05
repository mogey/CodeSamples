function enemies:Update(dt)
	for i,v in ipairs(enemies) do
    	v.y = v.y + dt*enemies.speed
    		if v.y > hero.y then table.remove(enemies, i) gameState = "gameOver" end


	end
end