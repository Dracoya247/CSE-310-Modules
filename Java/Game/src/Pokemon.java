package Game.src;

public class Pokemon {
    private String name;
    private String element;
    private int power;
    protected int level;
    protected int health;
    protected boolean hasFainted = false;
    private String graphicsFileName;


    public Pokemon(int i, int l){

    }

    private void setName(int index){

    }

    private void setElement(int index){

    } 

    private void setGraphicsFile(int index){

    }

    private void setPower(int index, int level){

    }

    private void setBaseHealth(int index, int level){

    }

    private void setCanEvolve(int level){

    }

    private void setMoveset(int index, int level){

    }

    private void setStats(int index, int level){
        setName(index);
        setElement(index);
        setGraphicsFile(index);
        setPower(index, level);
        setBaseHealth(index, level);
        setCanEvolve(level);
        setMoveset(index, level);
    }
}
