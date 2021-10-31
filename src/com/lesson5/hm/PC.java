package com.lesson5.hm;

public class PC {
    private String gpu;

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }



    @Override
    public String toString() {
        return "PC{" +
                "gpu='" + gpu + '\'' +
                '}';
    }

    //Alt + insert  - Getter and Setter , toString()


}
