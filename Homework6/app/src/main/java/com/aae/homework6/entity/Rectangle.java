package com.aae.homework6.entity;

public class Rectangle implements Figure{

    @Override
    public int figureArea(int width, int height) {
        return width * height;
    }

    @Override
    public int figurePerimeter(int width, int height) {
        return (width + height) * 2;
    }
}
