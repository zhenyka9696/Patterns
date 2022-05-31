package com.company;
//outer builder
public class ThreeLittlePigs {
    public static void main(String[] args) {
Manager manager=new Manager();
Builder nifNif=new NifNif();
        Builder nafNaf=new NafNaf();
        Builder nufNuf=new NufNuf();
        manager.SetBuilder(nufNuf);
        manager.getBuilder().buildWalls();
        manager.SetBuilder(nifNif);
        manager.getBuilder().buildRoof();
        manager.SetBuilder(nafNaf);
        manager.getBuilder().buildBase();
        manager.buildHouse();

    }
}

interface Builder{
    void buildBase();
    void buildWalls();
    void buildRoof();

}

class NifNif implements Builder{

    @Override
    public void buildBase() {
        System.out.println("I build the soil base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the soil walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("I build the straw roof");
    }
}

class NafNaf implements Builder{

    @Override
    public void buildBase() {
        System.out.println("I build the sand base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the sticks walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("I build the leaves roof");
    }
}

class NufNuf implements Builder{

    @Override
    public void buildBase() {
        System.out.println("I build the concrete base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the stone walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("I build the tile roof");
    }
}

class Manager{
    public Builder getBuilder() {
        return builder;
    }

    private Builder builder;

    public void SetBuilder(Builder builder) {
        this.builder = builder;
    }
    public void buildHouse(){
        builder.buildBase();
        builder.buildRoof();
        builder.buildWalls();
    }
}