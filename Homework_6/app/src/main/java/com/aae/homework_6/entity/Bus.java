package com.aae.homework_6.entity;

public class Bus implements Car{
    @Override
    public int carCapacity(int capacity) {
        return capacity;
    }

    @Override
    public int carMaxSpeed(int speed) {
        return speed;
    }

    @Override
    public float carMass(float mass) {
        return mass;
    }
}
