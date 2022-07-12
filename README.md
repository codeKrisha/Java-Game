# Gun Game
This game is based on concepts of `OOP` in Java programming Language.
##  Project Structure
- `bin` : all class file are generated here
- `lib` : empty in this project
-  `src` : all project file 

    - `app.java` : this file content `main` method
    - `Player1.java` : Has information related to first player

    - `Player2.java` : this class extend `Player1` and *override* it's method

### `Player1.java`
In this class create three private variable as shown
```
private String name;
private String weapon;
private int health;
```
create getter and setter method for that variables

In this class create three method as shown
    
  ```
public void damageByGun1()
public void damageByGun2()    
public void heal()
  ```