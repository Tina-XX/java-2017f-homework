package Characters;

public class SnakeMonster extends Cheerer {
    public SnakeMonster(String name){
        super(name);
    }
    @Override
    public void prepareRenderComponent() {
        // Cheerer不参与战斗，不去设置attack
        renderComponent.prepare(RenderComponent.ImageType.HEALTH_BAR_FILL, "Image/healthBarFill.png", 1);
        renderComponent.prepare(RenderComponent.ImageType.IDLE, "Image/shejing_idle.png", 1);
        renderComponent.prepare(RenderComponent.ImageType.TOMB, "Image/tomb.png", 1);
        renderComponent.prepare(RenderComponent.ImageType.HEALTH_BAR, "Image/healthBar.png", 1);

    }
}
