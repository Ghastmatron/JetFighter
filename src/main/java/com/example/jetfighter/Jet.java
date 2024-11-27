package com.example.jetfighter;

public class Jet {
    //main jet class
    //this class will be the total control of the jet
    //if the jet get's upgraded, this will be the thing to get updated from it

    //private variables
    private int Health, Speed, DMG, BulletSpeed, RateOfFire, xPos, yPos;
    private Jet jet;

    public Jet(){
        Health = this.Health;
        Speed = this.Speed;
        DMG = this.DMG;
        BulletSpeed = this.BulletSpeed;
        RateOfFire = this.RateOfFire;
    }

    //getters and setters
    public int getHealth(){
        return Health;
    }
    public int getSpeed(){
        return Speed;
    }
    public int getDMG(){
        return DMG;
    }
    public int getBulletSpeed(){
        return BulletSpeed;
    }
    public int getRateOfFire(){
        return RateOfFire;
    }
    public int getxPos(){
        return xPos;
    }
    public int getyPos(){
        return yPos;
    }
    public Jet getJet(){
        return jet;
    }

    public void setxPos(int X){
        this.xPos = X;
    }
    public void setyPos(int Y){
        this.yPos = Y;
    }

}
