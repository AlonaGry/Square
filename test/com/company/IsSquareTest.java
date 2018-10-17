package com.company;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DataDrivenTestsWithSpreadsheetTest {
    private int m;
    private boolean isSquare;


    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(IsSquare.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Parameters
    public static Collection spreadsheetData () throws IOException{
        InputStream spreadsheet = new FileInputStream("C:/Git/Square/test/com/company/resources/isSquare.xlsx");
        return new SpreadsheetData(spreadsheet).getData();
    }
    public DataDrivenTestsWithSpreadsheetTest(int m, boolean isSquare){
        super();
        this.m = m;
        this.isSquare = isSquare;
    }

    @Test
    public void isSquare() {
        System.out.println("isSquare");
       // IsSquare s = new IsSquare();

        boolean actual = IsSquare.isSquare(m);
        Assert.assertEquals(is(isSquare), actual);
    }
}
