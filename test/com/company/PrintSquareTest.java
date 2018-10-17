package com.company;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class PrintSquareTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(PrintSquare.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("setUp");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @org.junit.Test
    public void print_N_OfSquareFromA() {
        System.out.println("print_N_OfSquareFromA");
        PrintSquare sq = new PrintSquare();
        StringBuffer expected = new StringBuffer("0, 1, 4, 9 ");
        StringBuffer actual;
        actual = PrintSquare.Print_N_OfSquareFromA(0, 4);
        Assert.assertEquals(expected, actual);
    }
}
