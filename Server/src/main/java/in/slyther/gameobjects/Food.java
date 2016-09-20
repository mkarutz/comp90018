package in.slyther.gameobjects;

import com.google.flatbuffers.FlatBufferBuilder;
import in.slyther.math.Vector2;
import slyther.flatbuffers.FoodState;
import slyther.flatbuffers.Vec2;
import slyther.flatbuffers.FColor;
import java.awt.Color;

public class Food {
    private Vector2 position;
    private int weight;
    private boolean isActive;
    private Color  color;


    public Food(Vector2 position, int weight, Color color) {
        this.position = position;
        this.weight = weight;
        this.color = color;
    }

    public int serialize(FlatBufferBuilder builder, int index) {
        FoodState.startFoodState(builder);
        FoodState.addFoodId(builder, index);
        FoodState.addIsActive(builder, isActive);
        FoodState.addWeight(builder, weight);
        FoodState.addColor(builder,FColor.createFColor(builder,color.getRed(),color.getGreen(),color.getBlue()));
        FoodState.addPosition(builder, Vec2.createVec2(builder, position.getX(), position.getY()));

        return FoodState.endFoodState(builder);
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
