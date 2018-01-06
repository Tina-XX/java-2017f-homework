package Characters;

import Types.COLOR;
import Types.SENIORITY;

import javax.swing.*;
import java.net.URL;

public class Huluwa extends Creature implements Comparable {

    private COLOR color;
    private SENIORITY seniority;


    public COLOR getColor() {
        return color;
    }

    public SENIORITY getSeniority() {
        return seniority;
    }


    public Huluwa(COLOR color, SENIORITY seniority) {
        super();

        this.color = color;
        this.seniority = seniority;

        this.combatComponent.setAttackValue(20);
    }
    @Override
    protected void prepareRenderComponent() {
        try {
            renderComponent.prepare(RenderComponent.ImageType.MOVING, "Image/hero_moving.png", 6);
            renderComponent.prepare(RenderComponent.ImageType.HEALTH_BAR, "Image/healthBar.png", 1);
            renderComponent.prepare(RenderComponent.ImageType.HEALTH_BAR_FILL, "Image/healthBarFill.png", 1);
            renderComponent.prepare(RenderComponent.ImageType.TOMB, "Image/tomb.png", 1);
            renderComponent.prepare(RenderComponent.ImageType.ATTACKING, "Image/hero_attack.png", 4);
            renderComponent.prepare(RenderComponent.ImageType.IDLE, "Image/hero_idle.png", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void report() {
        System.out.print(this.toString());
    }


    @Override
    protected void doThreadOperations() {
        try {
            doBattleOperations();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    @Override
    public String toString(){
        return this.seniority.toString()
                + "(" + this.color.toString() + ")@"
                + this.position.getX() + "," + this.position.getY()
                + ";";
    }

    @Override
    public boolean biggerThan(Comparable brother){

        if (brother instanceof  Huluwa)
            return this.getSeniority().ordinal()> ((Huluwa) brother).getSeniority().ordinal();
        else
            return false;
    }

    @Override
    public void changePositionWith(Creature another){
        if(another instanceof Huluwa) {
            System.out.println(seniority + ": "
                    + this.position.getX() + "," + this.position.getY()
                    + "->"
                    + another.position.getX() + "," + another.position.getY()
            );
        }

        super.changePositionWith(another);
    }
}



