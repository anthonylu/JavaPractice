package tw.cclu.concept;

import org.junit.Assert;

public class Inheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Assert.assertEquals(1, a.getIntField());// get A's intField
        Assert.assertEquals(2, b.getIntField());// get B's intField
        Assert.assertEquals(2, ((A)b).getIntField());// method overriding -> get B's intField
        Assert.assertEquals(1, b.getParentIntField());// get A's intField
        Assert.assertEquals(1, ((A)b).intField);// get A's intField
        Assert.assertEquals(2, b.intField);// get B's intField
        Assert.assertEquals(3, ((A)c).getIntField());// method overriding and inherit A's intField
        Assert.assertEquals(4, c.intField);// inherit A's intField
    }
}

class A {
    public int intField = 1;

    public int getIntField() {
        return intField;
    }
}
class B extends A {
    public int intField = 2;

    @Override
    public int getIntField() {
        return intField;
    }
    public int getParentIntField() {
        return super.intField;
    }
}
class C extends A {
    public C() {
        this.intField = 4;
    }

    @Override
    public int getIntField() {
        return intField-1;
    }
}
