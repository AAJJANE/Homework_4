package com.aae.homework6.entity;

public class Triangle implements Figure{

    @Override
    public int figureArea(int width, int height) {
        return width * height / 2;
    }

    @Override
    public int figurePerimeter(int width, int height) {
        return (int) (Math.sqrt(width * width + height * height) + width + height);
    }
}
