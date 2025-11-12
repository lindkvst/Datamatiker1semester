package Lesson19.Homework;

public class Cup {
    private String liquidType;
    private int percentageFilled;

    public Cup(String liquidType, int percentageFilled) {
        this.liquidType = liquidType;
        this.percentageFilled = percentageFilled;

    }

    public String getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(String liquidType) {
        this.liquidType = liquidType;
    }

    public int getPercentageFilled() {
        return percentageFilled;
    }

    public void setPercentageFilled(int percentageFilled) {
        this.percentageFilled = percentageFilled;
    }


}
