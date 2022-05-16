package com.lab7;

public class Complex {
    private double module;
    private double arg;

    public Complex(double module, double arg) {
        this.module = module;
        this.arg = arg;
    }

    public String trigForm(){
        return this.module + "(cos(" + arg + ") + i * sin(" + arg + "))";
    }

    public String algForm(){
        return (this.module * Math.cos(arg)) + " + (" + (this.module * Math.sin(arg)) + "i)";
    }

    public double modulePower(int n){
        return Math.pow(this.module, n);
    }

    public Complex mul(Complex complex){
        return new Complex(this.module * complex.getModule(), this.arg + complex.getArg());
    }

    public Complex div(Complex complex){
        return new Complex(this.module / complex.getModule(), this.arg - complex.getArg());
    }

    public Complex add(Complex complex){
        return new Complex(this.module + complex.getModule(), this.arg + complex.getArg());
    }

    public Complex sub(Complex complex){
        return new Complex(this.module - complex.getModule(), this.arg - complex.getArg());
    }

    public Complex pow(double pow){
        return new Complex(Math.pow(this.module, pow), this.arg * pow);
    }



    public double getModule() {
        return module;
    }

    public void setModule(double module) {
        this.module = module;
    }

    public double getArg() {
        return arg;
    }

    public void setArg(double arg) {
        this.arg = arg;
    }

    public static void main(String[] args) {
        Complex a = new Complex(2.0, Math.PI/6);
        Complex b = new Complex(3.0, Math.PI/2);
        Complex c = new Complex(4.0, Math.PI);
        Complex d = new Complex(1.0, Math.PI/4);
        System.out.println("Complex 'a' in trig form: " + a.trigForm());
        System.out.println("Complex 'a' in alg form: " + a.algForm());
        Complex r = d.mul(a.add(b).div(c.sub(a))).add(b.pow(3));
        System.out.println("trig form: R = " + r.trigForm());
        System.out.println("alg form: R = " + r.algForm());
    }
}
